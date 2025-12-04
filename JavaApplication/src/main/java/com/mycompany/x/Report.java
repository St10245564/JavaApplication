/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.x;
import javax.swing.JOptionPane;
public class Report {
    // Array variables
    private final String[] name = new String[100];
    private final String[] description = new String[100];
    private final String[] developerName = new String[100];
    private final int[] taskNumber = new int[100];
    private final int[] duration = new int[100];
    private final String[] taskID = new String[100];
    private final String[] status = new String[100];

    // Other variables
    private int count = 1;

    public void menus() {
    JOptionPane.showMessageDialog(null, "Welcome to Easykanban");

    while (true) {
        String menuChoice = JOptionPane.showInputDialog(
                "Menu:\n" +
                        "  1. Add Task\n" +
                        "  2. Display Tasks with Status 'Done'\n" +
                        "  3. Display Task with Longest Duration\n" +
                        "  4. Search Task by Name\n" +
                        "  5. Search Tasks by Developer\n" +
                        "  6. Delete Task by Name\n" +
                        "  7. Display Full Task Report\n" +
                        "  8. Quit"
        );

        try {
            int menu = Integer.parseInt(menuChoice);

            switch (menu) {
                case 1:
                    int numTasksToAdd = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks you want to add:"));
                    for (int i = 0; i < numTasksToAdd; i++) {
                        taskDetails();
                    }
                    break;
                case 2:
                    displayTasksWithStatus("Done");
                    break;
                case 3:
                    displayTaskWithLongestDuration();
                    break;
                case 4:
                    searchTaskByName();
                    break;
                case 5:
                    searchTasksByDeveloper();
                    break;
                case 6:
                    deleteTaskByName();
                    break;
                case 7:
                    displayFullTaskReport();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input!");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
        }
    }
}


    public void taskDetails() {
        String taskName = JOptionPane.showInputDialog("Enter Task name:");

        String taskDescription = JOptionPane.showInputDialog("Enter Task Description:");
        while (taskDescription.length() > 50) {
            JOptionPane.showMessageDialog(null, "Enter description not more than 50 characters!");
            taskDescription = JOptionPane.showInputDialog("Enter Task Description:");
        }

        String fullName = JOptionPane.showInputDialog("Enter Developer First and Last Name:");

        int taskDuration;
        try {
            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration in Hours:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid duration.");
            return;
        }

        String[] statusOptions = {"To Do", "Done", "Doing"};
        int statusChoice = JOptionPane.showOptionDialog(
                null,
                "Select Task Status:",
                "Task Status",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                statusOptions,
                "To Do"
        );

        if (statusChoice >= 0 && statusChoice < statusOptions.length) {
            String taskStatus = statusOptions[statusChoice];

            // Store task details in parallel arrays
            name[count] = taskName;
            description[count] = taskDescription;
            developerName[count] = fullName;
            duration[count] = taskDuration;
            taskNumber[count] = count;
            taskID[count] = generateTaskID(taskName, count, fullName);
            status[count] = taskStatus;
            count++;

            JOptionPane.showMessageDialog(null, "Task added successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid status choice!");
        }
    }

    public void displayTasksWithStatus(String status) {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("Tasks with Status '").append(status).append("':\n");

        for (int i = 1; i < count; i++) {
            if (this.status[i].equalsIgnoreCase(status)) {
                reportBuilder
                        .append("Task Name: ").append(name[i]).append("\n")
                        .append("Developer: ").append(developerName[i]).append("\n")
                        .append("Task Status: ").append(this.status[i]).append("\n\n");
            }
        }

        if (reportBuilder.length() > 0) {
            JOptionPane.showMessageDialog(null, reportBuilder.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks found with the specified status!");
        }
    }

    public void displayTaskWithLongestDuration() {
        int longestIndex = 1;
        int longestDuration = 0;

        for (int i = 1; i < count; i++) {
            if (duration[i] > longestDuration) {
                longestDuration = duration[i];
                longestIndex = i;
            }
        }

        String longestTaskDeveloper = developerName[longestIndex];
        int longestTaskDuration = duration[longestIndex];

        JOptionPane.showMessageDialog(null, "Developer: " + longestTaskDeveloper + "\nDuration: " + longestTaskDuration);
    }

    public void searchTaskByName() {
        String searchName = JOptionPane.showInputDialog("Enter the Task Name to search:");

        for (int i = 1; i < count; i++) {
            if (name[i].equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(null,
                        "Task Name: " + name[i] +
                                "\nDeveloper: " + developerName[i] +
                                "\nTask Status: " + status[i]
                );
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Task not found!");
    }

    public void searchTasksByDeveloper() {
        String searchDeveloper = JOptionPane.showInputDialog("Enter the Developer Name to search:");

        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("Tasks assigned to ").append(searchDeveloper).append(":\n");

        for (int i = 1; i < count; i++) {
            if (developerName[i].equalsIgnoreCase(searchDeveloper)) {
                reportBuilder
                        .append("Task Name: ").append(name[i]).append("\n")
                        .append("Task Status: ").append(status[i]).append("\n\n");
            }
        }

        if (reportBuilder.length() > 0) {
            JOptionPane.showMessageDialog(null, reportBuilder.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks assigned to the developer!");
        }
    }

    public void deleteTaskByName() {
        String deleteName = JOptionPane.showInputDialog("Enter the Task Name to delete:");

        for (int i = 1; i < count; i++) {
            if (name[i].equalsIgnoreCase(deleteName)) {
                // Shift the elements in the arrays to remove the task
                for (int j = i; j < count - 1; j++) {
                    name[j] = name[j + 1];
                    description[j] = description[j + 1];
                    developerName[j] = developerName[j + 1];
                    taskNumber[j] = taskNumber[j + 1];
                    duration[j] = duration[j + 1];
                    taskID[j] = taskID[j + 1];
                    status[j] = status[j + 1];
                }
                count--;

                JOptionPane.showMessageDialog(null, "Task deleted successfully!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found!");
    }

    public void displayFullTaskReport() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("Full Task Report:\n\n");

        // Find the maximum length among all fields
        int maxFieldLength = Math.max(Math.max(Math.max(Math.max(
                "Task ID".length(), "Task Name".length()), "Task Description".length()), "Developer".length()), "Duration (hours)".length());

        // Append each field and value vertically
        for (int i = 1; i < count; i++) {
            reportBuilder.append(formatField("Task ID", taskID[i], maxFieldLength))
                    .append(formatField("Task Name", name[i], maxFieldLength))
                    .append(formatField("Task Description", description[i], maxFieldLength))
                    .append(formatField("Developer", developerName[i], maxFieldLength))
                    .append(formatField("Duration (hours)", String.valueOf(duration[i]), maxFieldLength))
                    .append(formatField("Status", status[i], maxFieldLength))
                    .append("\n");
        }

        JOptionPane.showMessageDialog(null, "<html><pre>" + reportBuilder.toString() + "</pre></html>");
    }

    // Helper method to format each field and value vertically
    
    public String generateTaskID(String taskName, int count, String developerName) {
        String initials = "";
        String[] names = developerName.split(" ");
        for (String name : names) {
            initials += name.charAt(0);
        }
        return initials + "*" + taskName.charAt(0) + "*" + count;
    }private String formatField(String fieldName, String fieldValue, int maxFieldLength) {
    StringBuilder fieldBuilder = new StringBuilder();
    fieldBuilder.append(fieldName).append(":\n");
    fieldBuilder.append(String.format("%-" + maxFieldLength + "s", fieldValue)).append("\n");
    fieldBuilder.append(String.format("%-" + maxFieldLength + "s", "").replaceAll(".", "-")).append("\n");
    return fieldBuilder.toString();
}

}
