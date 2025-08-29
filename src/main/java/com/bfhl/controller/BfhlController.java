package com.bfhl.controller;
import com.bfhl.model.BfhlRequest;
import com.bfhl.model.BfhlResponse;
import com.bfhl.service.BfhlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/bfhl")
public class BfhlController {
    @Autowired
    private BfhlService bfhlService;
    private final String fullName = "aradhye swarup";
    private final String email = "aradhye.swarup2022@vitstudent.ac.in";
    private final String rollNumber = "22BCE2906";
    @PostMapping
    public ResponseEntity<BfhlResponse> processBfhl(@RequestBody BfhlRequest request) {
        try {
            BfhlResponse response = bfhlService.processRequest(request, fullName, email, rollNumber);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            BfhlResponse errorResponse = new BfhlResponse();
            errorResponse.setIs_success(false);
            errorResponse.setUser_id(fullName.toLowerCase() + "_29082025");
            errorResponse.setEmail(email);
            errorResponse.setCollege_roll_number(rollNumber);
            return ResponseEntity.ok(errorResponse);
        }
    }
}
