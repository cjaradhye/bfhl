package com.bfhl.model;
import java.util.List;
public class BfhlResponse {
    private boolean is_success;
    private String user_id;
    private String email;
    private String college_roll_number;
    private List<Integer> even_numbers;
    private List<Integer> odd_numbers;
    private List<String> alphabets;
    private List<String> special_characters;
    private int sum;
    private String reversed_alphabets;
    public boolean isIs_success() {
        return is_success;
    }
    public void setIs_success(boolean is_success) {
        this.is_success = is_success;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCollege_roll_number() {
        return college_roll_number;
    }
    public void setCollege_roll_number(String college_roll_number) {
        this.college_roll_number = college_roll_number;
    }
    public List<Integer> getEven_numbers() {
        return even_numbers;
    }
    public void setEven_numbers(List<Integer> even_numbers) {
        this.even_numbers = even_numbers;
    }
    public List<Integer> getOdd_numbers() {
        return odd_numbers;
    }
    public void setOdd_numbers(List<Integer> odd_numbers) {
        this.odd_numbers = odd_numbers;
    }
    public List<String> getAlphabets() {
        return alphabets;
    }
    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }
    public List<String> getSpecial_characters() {
        return special_characters;
    }
    public void setSpecial_characters(List<String> special_characters) {
        this.special_characters = special_characters;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public String getReversed_alphabets() {
        return reversed_alphabets;
    }
    public void setReversed_alphabets(String reversed_alphabets) {
        this.reversed_alphabets = reversed_alphabets;
    }
}
