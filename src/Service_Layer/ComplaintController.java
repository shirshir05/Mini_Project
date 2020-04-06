package Service_Layer;

import Business_Layer.Trace.PersonalPage;
import Business_Layer.UserManagement.Complaint;
import Business_Layer.UserManagement.SystemAdministrator;

import java.util.Scanner;

public class ComplaintController extends LogicManagement{
    Complaint complaints;
    public void add_complaint(String description){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter tour complaint:");
        String complaint_description="";
        complaint_description+=scanner.nextLine();
        scanner.close();
        complaints.updateComplaint(complaint_description);
    }
}
