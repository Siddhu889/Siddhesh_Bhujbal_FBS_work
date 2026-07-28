#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <sstream>
#include <cstdlib>
using namespace std;

class Person {
protected:
    string name;
    int age;

public:
    Person(string n, int a) {
        name = n;
        age = a;
    }

    virtual void displayDetails() const = 0;

    virtual ~Person() {}
};

class Student : public Person {
private:
    int rollNo;
    string course;
    float marks;

public:
    Student(string n, int a, int roll, string c, float m) : Person(n, a) {
        rollNo = roll;
        course = c;
        marks = m;
    }

    int getRollNo() const {
        return rollNo;
    }

    string getName() const {
        return name;
    }

    int getAge() const {
        return age;
    }

    string getCourse() const {
        return course;
    }

    float getMarks() const {
        return marks;
    }

    void setMarks(float m) {
        marks = m;
    }

    void setCourse(string c) {
        course = c;
    }

    void displayDetails() const {
        cout << "Roll No: " << rollNo
            << " | Name: " << name
             << " | Age: " << age
             << " | Course: " << course
             << " | Marks: " << marks << endl;
    }

    void displayDetails(bool shortView) const {
        if (shortView == true) {
            cout << rollNo << " - " << name << " (" << marks << ")" << endl;
        } else {
           displayDetails();
        }
    }

    string toFileString() const {
      stringstream ss;
        ss << rollNo << "," << name << "," << age << "," << course << "," << marks;
        return ss.str();
    }
};

class StudentManager {
private:
    vector<Student> students;
    string fileName;

public:
 StudentManager() {
        fileName = "students.txt";
    }

    void addStudent() {
       int roll, age;
        string name, course;
        float marks;

        cout << "\nEnter Roll No: ";
        cin >> roll;

        if (findStudent(roll) != -1) {
        cout << "Student with this Roll No already exists!\n";
            return;
        }

        cin.ignore();

        cout << "Enter Name: ";
        getline(cin, name);

        cout << "Enter Age: ";
        cin >> age;

        cin.ignore();

        cout << "Enter Course: ";
        getline(cin, course);

        cout << "Enter Marks: ";
        cin >> marks;

        Student s(name, age, roll, course, marks);
        students.push_back(s);

         cout <<"Student added successfully!\n";
    }

    void displayAll() const {
        if (students.size() == 0) {
            cout << "\nNo records found.\n";
            return;
        }

        cout <<"\n---------- All Student Records ----------\n";

        for (int i = 0; i < students.size(); i++) {
            students[i].displayDetails();
        }
    }

    int findStudent(int roll) const {
        for (int i = 0; i < students.size(); i++) {
            if (students[i].getRollNo() == roll) {
                return i;
            }
        }

        return -1;
    }

    void searchStudent() const {
        int roll;

        cout << "\nEnter Roll No to search: ";
        cin >> roll;

        int idx = findStudent(roll);

        if (idx == -1) {
            cout << "Student not found.\n";
        } else {
            cout << "Record found:\n";
            students[idx].displayDetails();
        }
    }

    void updateStudent() {
        int roll;

        cout << "\nEnter Roll No to update: ";
        cin >> roll;

        int idx = findStudent(roll);

        if (idx == -1) {
            cout << "Student not found.\n";
            return;
        }

        string newCourse;
        float newMarks;

        cin.ignore();

        cout << "Enter new Course: ";
        getline(cin, newCourse);

        cout << "Enter new Marks: ";
        cin >> newMarks;

        students[idx].setCourse(newCourse);
        students[idx].setMarks(newMarks);

        cout << "Record updated successfully!\n";
    }

    void deleteStudent() {
        int roll;

        cout << "\nEnter Roll No to delete: ";
        cin >> roll;

        int idx = findStudent(roll);

        if (idx == -1) {
            cout << "Student not found.\n";
            return;
        }

        students.erase(students.begin() + idx);

        cout << "Record deleted successfully!\n";
    }

    void saveToFile() const {
        ofstream outFile(fileName.c_str());

        for (int i = 0; i < students.size(); i++) {
            outFile << students[i].toFileString() << endl;
        }

        outFile.close();

        cout << "Data saved to " << fileName << " successfully!\n";
    }

    void loadFromFile() {
        ifstream inFile(fileName.c_str());

        if (!inFile) {
            cout << "No previous data file found. Starting fresh.\n";
            return;
        }

        students.clear();

        string line;

        while (getline(inFile, line)) {
            if (line.length() == 0) {
                continue;
            }

            stringstream ss(line);

            string rollStr, name, ageStr, course, marksStr;

            getline(ss, rollStr, ',');
            getline(ss, name, ',');
            getline(ss, ageStr, ',');
            getline(ss, course, ',');
            getline(ss, marksStr, ',');

            int roll = atoi(rollStr.c_str());
            int age = atoi(ageStr.c_str());
            float marks = atof(marksStr.c_str());

            Student s(name, age, roll, course, marks);
            students.push_back(s);
        }

        inFile.close();

        cout << "Data loaded from file successfully!\n";
    }
};

void showMenu() {
    cout << "\n========== STUDENT RECORD MANAGEMENT SYSTEM ==========\n";
    cout << "1. Add Student\n";
    cout << "2. Display All Students\n";
    cout << "3. Search Student by Roll No\n";
    cout << "4. Update Student\n";
    cout << "5. Delete Student\n";
    cout << "6. Save Records to File\n";
    cout << "7. Load Records from File\n";
    cout << "8. Exit\n";
    cout << "Enter your choice: ";
}

int main() {
    StudentManager manager;

    manager.loadFromFile();

    int choice;

    do {
        showMenu();
        cin >> choice;

        if (choice == 1) {
            manager.addStudent();
        } else if (choice == 2) {
            manager.displayAll();
        } else if (choice == 3) {
            manager.searchStudent();
        } else if (choice == 4) {
            manager.updateStudent();
        } else if (choice == 5) {
            manager.deleteStudent();
        } else if (choice == 6) {
            manager.saveToFile();
        } else if (choice == 7) {
            manager.loadFromFile();
        } else if (choice == 8) {
            cout << "Exiting... Saving data before exit.\n";
            manager.saveToFile();
        } else {
            cout << "Invalid choice! Try again.\n";
        }

    } while (choice != 8);

    return 0;
}
