📋 Project Overview
EasyKanban is a comprehensive task management application built with Java Swing that provides user authentication, task tracking, and reporting functionalities. This application follows a structured workflow for project management with an intuitive graphical interface.

✨ Features
🔐 User Management
User Registration: Create new accounts with username and password

Secure Login: Authenticated access to the task management system

User Session Management: Persistent user data storage during runtime

📊 Task Management
Task Creation: Add multiple tasks with detailed descriptions

Task Status Tracking: Monitor tasks through "To Do", "Doing", and "Done" states

Developer Assignment: Assign tasks to specific developers

Duration Tracking: Log task completion time in hours

🔍 Advanced Search & Reporting
Status-based Filtering: View all tasks with "Done" status

Developer Task Listing: Display all tasks assigned to specific developers

Task Search: Find tasks by name or developer

Duration Analytics: Identify the task with the longest duration

Comprehensive Reports: Generate detailed task reports with formatted output

🗑️ Data Management
Task Deletion: Remove tasks by name

Data Validation: Input validation for task descriptions and durations

Parallel Array Storage: Efficient data organization using synchronized arrays

🚀 Installation & Setup
Prerequisites
Java Development Kit (JDK) 8 or higher

Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or command-line tools

Installation Steps
Clone or Download the Project

bash
git clone [repository-url]
Compile the Java Files

bash
javac *.java
Run the Application

bash
java Main
🎯 Usage Guide
1. Initial Setup
Launch the application to access the main menu

Choose between:

Login: For existing users

Create Account: For new users

Quit: Exit the application

2. User Registration
Select "Create Account" from the main menu

Enter your first and last name

Choose a username and password

Upon successful registration, you'll be directed to the task management dashboard

3. Task Management Workflow
Adding Tasks
Select "Add Task" from the menu

Enter the number of tasks to add

For each task, provide:

Task Name

Description (≤ 50 characters)

Developer's full name

Duration in hours

Current status (To Do/Doing/Done)

Viewing Tasks
Option 2: View all completed tasks

Option 3: Find the task with the longest duration

Option 7: Display a comprehensive task report

Searching Tasks
Option 4: Search by task name

Option 5: Search by developer name

Managing Tasks
Option 6: Delete tasks by name

Option 8: Exit the application

📁 Project Structure
text
EasyKanban/
│
├── Main.java              # Application entry point & user authentication
├── RegisterClass.java     # User registration and login functionality
├── Report.java           # Task management and reporting system
│
├── Core Functionalities:
│   ├── User Authentication
│   ├── Task CRUD Operations
│   ├── Data Validation
│   ├── Search & Filtering
│   └── Report Generation
│
└── Data Storage:
    └── Parallel arrays for efficient task management
🔧 Technical Implementation
Data Structures
Parallel Arrays: Synchronized arrays for storing task attributes

ArrayList: Dynamic storage for user accounts

String Arrays: Fixed-size arrays for task management (100 tasks capacity)

Key Methods
generateTaskID(): Creates unique task identifiers using developer initials and task details

formatField(): Formats report output for better readability

LOGINUser(): Validates user credentials

menus(): Main navigation interface

UI Components
JOptionPane: For all dialog boxes and user interactions

Color Customization: Teal and Cyan theme for better visual appeal

Input Validation: Robust error handling for user inputs

⚡ Performance Features
Efficient Searching: Linear search algorithms for task retrieval

Memory Optimization: Fixed array sizes prevent memory leaks

Real-time Updates: Immediate reflection of task modifications

User-friendly Interface: Intuitive menu-driven navigation

🛡️ Validation & Error Handling
Input Validation
Task description length validation (≤ 50 characters)

Numeric input validation for task duration

Menu option range validation

User credential validation

Error Handling
NumberFormatException handling for numeric inputs

Array bounds checking

Null input prevention

User-friendly error messages

📈 Reporting System
The application generates comprehensive reports with:

Vertically formatted task details

Consistent field alignment

Clear section separators

HTML-formatted display for better readability

🔮 Future Enhancements
Potential improvements for future versions:

Database Integration: Replace arrays with database storage

User Roles: Implement admin/user permission levels

Task Prioritization: Add priority levels to tasks

Email Notifications: Task assignment notifications

Data Export: Export reports to CSV/PDF formats

Graphical Charts: Visual representation of task statistics

Multi-user Support: Concurrent user access

Cloud Backup: Task data synchronization

🐛 Troubleshooting
Common Issues & Solutions
"Invalid input!" message

Ensure you enter numbers for menu selections

Check that task durations are numeric values

Task not found in searches

Verify exact task name spelling

Check case sensitivity in search terms

Array capacity reached

Maximum 100 tasks supported

Delete unnecessary tasks to free space

Login failures

Verify username/password accuracy

Register first if no account exists

📝 Code Quality Features
Modular Design: Separated concerns across classes

Code Readability: Clear method names and comments

Consistent Styling: Follows Java naming conventions

Error Prevention: Comprehensive input validation

Memory Management: Proper array management

🤝 Contributing
Contributions are welcome! Please follow these steps:

Fork the repository

Create a feature branch

Commit your changes

Push to the branch

Open a Pull Request

📄 License
This project is available for educational and personal use.

🙏 Acknowledgments
Built with Java Swing for desktop applications

Designed for software engineering coursework

Inspired by agile project management principles

🌟 Pro Tip: Use the "Display Full Task Report" feature regularly to get a comprehensive overview of all tasks and their current status!
