/**
 * 
 */
package com.project.web.tests;

import org.springframework.stereotype.Service;

@Service("cp")
public class HelloServiceImpl implements HelloService {
    public void print(String message) {
        System.out.println(message);
    }
}
 
