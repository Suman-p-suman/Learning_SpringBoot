package com.example.sumanpro.student;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {


    private final StudentService studentController;

    public StudentController(StudentService studentController) {
        this.studentController = studentController;
    }

    @GetMapping("/student")
    public List<StudentResponeDto> findAllStudent(){
        return studentController.findAllStudent();
}
    @GetMapping("/student/{student-id}")
    public StudentResponeDto findbysid(@PathVariable("student-id") Integer id){
        return studentController.findbysid(id);

    }

    @GetMapping("/student/search/{student-name}")
    public List<StudentResponeDto> findbyname(@PathVariable("student-name") String  name){
        return studentController.findbyname(name);

    }
    @DeleteMapping("/student/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("student-id") Integer id){
        studentController.delete(id);
    }
    @PostMapping("/students")
    public StudentResponeDto post(@Valid @RequestBody StudentDto msg){
        return studentController.post(msg);
    }
    @ExceptionHandler
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException exp){
        var errors=new HashMap<String ,String>();
        exp.getBindingResult().getAllErrors().forEach(error->{
            var fieldName=((FieldError)error).getField();
            var errormsg=error.getDefaultMessage();
            errors.put(fieldName,errormsg);
        });
        return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
    }

}
