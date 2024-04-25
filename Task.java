/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    private static int taskCount = 0;
    private static int totalHours = 0;
    
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private String taskDuration;
    private String taskID;
    private String taskStatus;
    
    public Task (String taskName, String taskNumber, int taskDuration, String taskDescription, String developerDetails){
    this.taskName = taskName;
    this.taskNumber = taskCount++;
    this.taskDescription = taskDescription;
    this.developerDetails = developerDetails;
    this.taskStatus = taskStatus;
    this.taskID = createTaskID();
    totalHours += taskDuration;
    }
    
    public boolean checkTaskDescription(){
        return this.taskDescription.length() <= 50;
    }
    
    public String createTaskID(){
        String firstTwoLetters = this.taskName.length()> 2 ? this.taskName.substring(0 , 2).toUpperCase(): this.taskName.toUpperCase();
        String lastThreeLetters = this.developerDetails.length()> 3? this.developerDetails.substring(this.developerDetails.length()- 3).toUpperCase(): this.developerDetails.toUpperCase();
        return firstTwoLetters + ":" + this.taskNumber + ":" + lastThreeLetters;
    }
    
    public String printTaskDetails(){
        return "Task Status: " + this.taskStatus + "\n" + "Developer Details: " + this.developerDetails + "\n" + "Task Number: " + this.taskNumber + "\n" + "Task Name: " + this.taskName + "\n" + "Task Description: " + this.taskDescription + "\n" + "Task ID: " + this.taskID + "\n" + "Duration: " + this.taskDuration + "hours";
    }
    
    public static int getTotalHours(){
        return totalHours;
    }

    void add(Task task) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
