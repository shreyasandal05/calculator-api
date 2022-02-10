package com.calculator.calculatorapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation")
public class OperationController {

    @GetMapping("/add")
    public int add(@RequestParam(value = "value1", defaultValue = "0") int value1, @RequestParam(value = "value2", defaultValue = "0") int value2 ){
        return value1 + value2;
    }
    @GetMapping("/subtract")
	public int subtract(@RequestParam(value = "value1", defaultValue = "0") int value1, @RequestParam(value = "value2", defaultValue = "0") int value2){
		return value1 - value2;
	}
    @GetMapping("/multiply")
	public int multiply(@RequestParam(value = "value1", defaultValue = "0") int value1, @RequestParam(value = "value2", defaultValue = "0") int value2){
		return value1*value2;
	}
	@GetMapping("/divide")
	public int divide(@RequestParam(value = "value1", defaultValue = "0") int value1, @RequestParam(value = "value2", defaultValue = "0") int value2){
		return value1/value2;
	}
}
