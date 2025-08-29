package com.bfhl.service;
import com.bfhl.model.BfhlRequest;
import com.bfhl.model.BfhlResponse;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class BfhlService {
    public BfhlResponse processRequest(BfhlRequest request, String fullName, String email, String rollNumber) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialChars = new ArrayList<>();
        int sum = 0;
        StringBuilder allAlphabets = new StringBuilder();
        for (String item : request.getData()) {
            if (item.matches("\\d+")) {
                int num = Integer.parseInt(item);
                sum += num;
                if (num % 2 == 0) {
                    evenNumbers.add(num);
                } else {
                    oddNumbers.add(num);
                }
            } else if (item.matches("[a-zA-Z]")) {
                alphabets.add(item.toUpperCase());
                allAlphabets.append(item);
            } else {
                specialChars.add(item);
            }
        }
        String reversed = allAlphabets.reverse().toString();
        StringBuilder altCaps = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            if (i % 2 == 0) {
                altCaps.append(Character.toUpperCase(c));
            } else {
                altCaps.append(Character.toLowerCase(c));
            }
        }
        BfhlResponse response = new BfhlResponse();
        response.setIs_success(true);
        response.setUser_id(fullName.toLowerCase() + "_29082025");
        response.setEmail(email);
        response.setCollege_roll_number(rollNumber);
        response.setEven_numbers(evenNumbers);
        response.setOdd_numbers(oddNumbers);
        response.setAlphabets(alphabets);
        response.setSpecial_characters(specialChars);
        response.setSum(sum);
        response.setReversed_alphabets(altCaps.toString());
        return response;
    }
}
