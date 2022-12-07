
// day-01 class and object

// #include<iostream>
// using namespace std;
// class message
// {
//     public:
//     void display(){
//         cout<<"First day of 100 days of code challenge ";
//     }
// };
// int main()
// {
//     message abc;
//     abc.display();
//     return 0;
// }

// #include<iostream>
// using namespace std;
// class sum
// {
//     private:
//     int a, b, sum;
//     public:
//     void intput(){
//         cout<<"Enter two integer values  : ";
//         cin>>a>>b;
//     }
//     void calculate(){
//         sum=a+b;
//     }
//     void display(){
//         cout<<"The sum of two values is  = "<<sum;
//     }
// };
// int main()
// {
//     sum x;
//     x.intput();
//     x.calculate();
//     x.display();
//     return 0;
// }

// #include<iostream>
// using namespace std;
// class calculate
// {
//     private:
//     int a, b, sum, sub, mult;
//     float divi;
//     public:
//     void get_data(){
//         cout<<"Enter two value : ";
//         cin>>a>>b;
//     }
//     void calculate_data(){
//         sum=a+b;
//         sub=a-b;
//         mult=a*b;
//         divi=a/b;
//     }
//     void display_data(){
//         cout<<"The sum of two values is = "<<sum<<endl;
//         cout<<"The subraction of two values is = "<<sub<<endl;
//         cout<<"The multiplication of two values is = "<<mult<<endl;
//         cout<<"The division of two values is = "<<divi;
//     }
// };
// int main()
// {
//     calculate x;
//     x.get_data();
//     x.calculate_data();
//     x.display_data();
//     return 0;
// }

// day-02  Inside the class definition

// student total marks

// #include<iostream>
// using namespace std;
// class inside
// {
//     private:
//     char name[20];
//     int rollno;
//     int math, phy, che, eng, cs;
//     int total;
//     public:
//     void get_data(){
//         cout<<"Enter the name : ";
//         cin>>name;
//         cout<<"Enter the roll no.  : ";
//         cin>>rollno;
//         cout<<"Enter the math marks : ";
//         cin>>math;
//         cout<<"Enter the physics marks : ";
//         cin>>phy;
//         cout<<"Enter the chemistry marks : ";
//         cin>>che;
//         cout<<"Enter the english marks : ";
//         cin>>eng;
//         cout<<"Enter the computer marks : ";
//         cin>>cs;
//     }
//     void cal_data(){
//         total = math+phy+che+eng+cs;
//     }
//     void disp_data(){
//         cout<<"Name is = "<<name<<endl;
//         cout<<"Roll no. = "<<rollno<<endl;
//         cout<<"Total marks = "<<total;
//     }
//     };
// int main()
// {
//     inside x;
//     x.get_data();
//     x.cal_data();
//     x.disp_data();
//     return 0;
// }

// Employee salary

// #include<iostream>
// using namespace std;
// class employee
// {
//     private:
//     char name[20];
//     int id;
//     int salary, bonus;
//     int total_salary;
//     public:
//     void input(){
//         cout<<"Enter the Employee name : ";
//         cin>>name;
//         cout<<"Enter the Employee id : ";
//         cin>>id;
//         cout<<"Enter salary : ";
//         cin>>salary;
//         cout<<"Enter bonus : ";
//         cin>>bonus;
//     }
//     void calculate(){
//         total_salary = salary + bonus;
//     }
//     void display(){
//         cout<<"Name = "<<name<<endl;
//         cout<<"id = "<<id<<endl;
//         cout<<"Total salary = "<<total_salary;
//     }
// };
// int main()
// {
//     employee abc;
//     abc.input();
//     abc.calculate();
//     abc.display();
//     return 0;
// }

// create a class school

// #include<iostream>
// using namespace std;
// class school
// {
//     private:
//     int id;
//     char name[30];
//     int school_fee, lab_fee, game_fee;
//     int total_fee;
//     public:
//     void get_data(){
//         cout<<"Enter student id : ";
//         cin>>id;
//         cout<<"Enter name : ";
//         cin>>name;
//         cout<<"Enter school fee, lab fee and game fee : ";
//         cin>>school_fee>>lab_fee>>game_fee;
//         total_fee = school_fee+lab_fee+game_fee;
//     }
//     void show_data(){
//         cout<<"Student id is = "<<id<<endl;
//         cout<<"Student Name is = "<<name<<endl;
//         cout<<"Total fee = "<<total_fee;
//     }
// };
// int main()
// {
//     school x;
//     x.get_data();
//     x.show_data();
//     return 0;
// }

// Create a class area 

// #include<iostream>
// using namespace std;
// class area
// {
//     private:
//     int radius;
//     int length, breadth, height;
//     float area_circle, area_rect, area_tri;
//     public:
//     void intput(){
//         cout<<"Enter radius, length, breadth and height : ";
//         cin>>radius>>length>>breadth>>height;
//     }
//     void calculate(){
//         area_circle = (3.14*radius*radius);
//         area_rect = (length*breadth);
//         area_tri = (0.5*breadth*height);
//     }
//     void display(){
//         cout<<"Area of Circle = "<<area_circle<<endl;
//         cout<<"Area of Reactangular = "<<area_rect<<endl;
//         cout<<"Area of Triangle = "<<area_tri;
//     }
// };
// int main()
// {
//     area abc;
//     abc.intput();
//     abc.calculate();
//     abc.display();
//     return 0;
// }


// day-03  Outside the class definition

// sum

// #include<iostream>
// using namespace std;
// class sum
// {
//     private:
//     int a, b, s;
//     public:
//     void input();
//     void calculate();
//     void display();
// };
//     void sum::input(){
//         cout<<"Enter two integer value : ";
//         cin>>a>>b;
//     }
//     void sum::calculate(){
//         s = a+ b;
//     }
//     void sum::display(){
//         cout<<"The sum of two  values = "<<s;
//     }
// int main()
// {
//     sum a;
//     a.input();
//     a.calculate();
//     a.display();
//     return 0;
// }

// Simple interest

// #include<iostream>
// using namespace std;
// class interest
// {
//     private:
//     int p, r, t;
//     float si;
//     public:
//     void get_data();
//     void cal_data();
//     void disp_data();
// };
//     void interest::get_data(){
//         cout<<"Enter principle value , rate and time : ";
//         cin>>p>>r>>t;
//     }
//     void interest::cal_data(){
//         si = (p*r*t)/100;
//     }
//     void interest::disp_data(){
//         cout<<"The simple interest = "<<si;
//     }
// int main()
// {
//     interest abc;
//     abc.get_data();
//     abc.cal_data();
//     abc.disp_data();
//     return 0;
// }

// create a class market and write a program with the help of outside the class.

// #include<iostream>
// using namespace std;
// class market
// {
//     private:
//     int amount, sgst, cgst;
//     int gst;
//     int total_amount;
//     public:
//     void input();
//     void calculate();
//     void show();
// };
//     void market::input(){
//         cout<<"Enter amount, sgst and cgst : ";
//         cin>>amount>>sgst>>cgst;
//     }
//     void market::calculate(){
//         gst = ((sgst+cgst)*28/100);
//         total_amount = amount+gst;
//     }
//     void market::show(){
//         cout<<"Total Amount : "<<total_amount;
//     }
// int main()
// {
//     market x;
//     x.input();
//     x.calculate();
//     x.show();
//     return 0;
// }

// sum of no. from 1 to 100.

// #include<iostream>
// using namespace std;
// class sum
// {
//     private:
//     int i, s=0;
//     public: 
//     void cal_data();
//     void show_data();
// };  
//     void sum::cal_data(){
//         for(i=1; i<=100; i++){
//             s = s+i;
//         }
//     }
//     void sum::show_data(){
//         cout<<"The sum of number from 1 to 100 = "<<s;
//     }
// int main()
// {
//     sum abc;
//     abc.cal_data();
//     abc.show_data();
//     return 0;
// }


// day-04 [ Inline function ]

/* This function is desinged to enhance
   the speed of the program.*/

// message

// #include<iostream>
// using namespace std;
// class msg
// {
//     public:
//     void display();
// };
// inline void msg::display(){
//     cout<<"This is the inline function";
// }
// int main()
// {
//     msg obj;
//     obj.display();
//     return 0;
// }

// product of two values

// #include<iostream>
// using namespace std;
// inline int product(int a, int b){
//     return a*b;
// }
// int main()
// {
//     cout<<product(12, 12);
//     return 0;
// }

// inline function with default argument

// #include<iostream>
// using namespace std;
// float sum(int a, float b=12.2){
//     return a+b;
// }
// int main()
// {
//     int abc=20;
//     cout<<"The sum-1 of values = "<<sum(abc)<<endl;
//     cout<<"The sum-2 of values = "<<sum(abc, 2.2);
//     return 0;
// }

//  day-05 [Function]

// sum

// #include<iostream>
// using namespace std;
// int sum(int a, int b){
//    return (a+b);
// }
// int main()
// {
//    int s;
//    s=sum(12, 13);
//    cout<<"The sum of two values is = "<<s;
//    return 0;
// }

// add the sum fo series using for loop with the help of funciton.

// #include<iostream>
// using namespace std;
// int loop(int i, int n, int s=0 ){   // s=0 is a default argument
//    for(i; i<=n; i++){
//       s=s+i;      
//    }
//    return s;
// }
// int main()
// {
//    int a; 
//    a=loop(1, 100);
//    cout<<"The sum of series is = "<<a;
//    return 0;
// }

// calculat addition, subtraction , multiplication and division with the help of function

// #include<iostream>
// using namespace std;
// int sum (int a, int b){
//    return a+b;
// }
// int sub(int a, int b){
//    return a-b;
// }
// int mult(int a, int b){
//    return a*b;
// }
// int divi(int a, int b){
//    return a/b;
// }
// int main()
// {
//    int addition, subtraction, multiplication;
//    float division;
//    addition = sum(12, 13);
//    subtraction = sub(10, 5);
//    multiplication = mult(5, 5);
//    division = divi(4, 2);
//    cout<<"Addition of two values = "<<addition<<endl;
//    cout<<"subtraction of two values = "<<subtraction<<endl;
//    cout<<"multiplication of two values = "<<multiplication<<endl;   
//    cout<<"division of two values = "<<division<<endl;
//       return 0;
// }

// find the circle 


// #include<iostream>
// using namespace std;
// int circle(float r){
//    return 3.14*r*r;
// }
// int main()
// {
//    float s;
//    s= circle(5);
//    cout<<"Circle is = "<<s;
//    return 0;
// }

// day-06 Recursive funcion || Function overloading

// sum of series from 1 to nth.

// #include<iostream>
// using namespace std;
// int sum(int n){
//    if(n!=0)
//     return (n+sum(n-1));
//    else
//     return n;
// }
// int main()
// {
//    int num, res;
//    cout<<"Enter the nth value : ";
//    cin>>num;
//    res = sum(num);
//    cout<<"The sum of series = "<<res;
//    return 0;
// }

// Function Overloading

// calculate area of circle , rectangle and triangle with the help of function overloading.

// #include<iostream>
// using namespace std;
// void area(int r){
//    float circle;
//    circle = 3.14*r*r;
//    cout<<"Area of circle is = "<<circle<<endl;
// }
// void area(int l, int b){
//    int rectangle;
//    rectangle = (l*b);
//    cout<<"Area of rectangle is = "<<rectangle<<endl;
// }
// void area(float b, float h){
//    float triangle;
//    triangle = (0.5*b*h);
//    cout<<"Area of triangle is = "<<triangle;
// }
// int main()
// {
//    area(5);
//    area(25, 50);
//    area(60,6.5);
//    return 0;
// }

// day-07 Static Member function

// print number

// #include<iostream>
// using namespace std;
// class msg
// {
//    static int a;
//    public:
//      static void show(){
//       cout<<"a = "<<a;
//      }
// };
// int msg::a=10;
// int main()
// {
//    msg::show();
//    return 0;
// }

// The scope rules and classes

// #include<iostream>
// using namespace std;
// class sample          // Global class
// {
//    public:
//     void show(){
//       cout<<"class outside the function "<<endl;
//     }
// };
// sample obj;          // Global Object
// int main()
// {
//    class demo        // Local class
//    {
//       public:
//        void display(){
//          cout<<"class inside the main";
//        }
//    };
//    demo p;          // local object
//    obj.show();
//    p.display();
//    return 0;
// }

// day-08 Nested class 

// message print

// #include<iostream>
// using namespace std;
// class outer
// {
//    public:
//     void display(){
//       cout<<"Outer class "<<endl;
//     }
//     class inner
//     {
//       public:
//        void show(){
//          cout<<"Inner class ";
//        }
//     };
// };
// int main()
// {
//    outer obj;
//    outer::inner abc;
//    obj.display();
//    abc.show();
//    return 0;
// }

/* find the area of triangle given three side and
   find the simple interest given principle, rate and time
   with the help of nested class */

// #include<iostream>      // [ nested class ]
// #include<math.h>
// using namespace std;
// class triangle    // find area of triangle
// {
//    private:
//    int a, b, c;
//    float s, area;
//    public:
//     void input(){
//       cout<<"Enter value for three sides : ";
//       cin>>a>>b>>c;
//     }
//     void calculate(){
//       s = (a+b+c)/2;
//       area = sqrt(s*(s-a)*(s-b)*(s-c));
//     }
//     void display(){
//    cout<<"Area of triangle is = "<<area<<endl;
//     }
//       class s_interest     // find simple interest
//       {
//          private:
//          int p, t;
//          float si, r;
//          public:
//           void get_data(){
//             cout<<"Enter value for principle, rate and time : ";
//             cin>>p>>r>>t;
//           }
//           void cal_data(){
//             si = (p*r*t)/100;
//           }
//           void disp_data(){
//             cout<<"Simple interest = "<<si;
//           }
//       };  // end s_interest class
// };   // end triangle class
// int main()
// {
//    triangle t;
//    triangle::s_interest s;
//    t.input();
//    t.calculate();
//    t.display();
//    s.get_data();
//    s.cal_data();
//    s.disp_data(); 
//    return 0;
// }

// Friend function

// #include<iostream>
// using namespace std;
// class sample
// {
//    private:
//    int a, b;
//    public:
//     void input(){
//       cout<<"Enter two integer values : ";
//       cin>>a>>b;
//     }
//     friend void add(sample abc);
// };
// void add(sample abc){
//    int c;
//    c = abc.a+abc.b;
//    cout<<"Sum = "<<c;
// }
// int main()
// {
//    sample obj;
//    obj.input();
//    add(obj);
//    return 0;
// }

// day-09 Operator Overloading

// #include<iostream>
// using namespace std;
// class sample
// {
//    private:
//    int a, b, c;
//    public:
//     void input(int , int, int);
//     void operator_();
//     void display();
// };
// void sample::input(int p, int q, int r){
//    a = p;
//    b = q; 
//    c = r;
// }
// void sample::operator_(){
//    a = -a;
//    b = -b;
//    c = -c;
// }
// void sample::display(){
//    cout<<"\n a = "<<a<<endl;
//    cout<<" b = "<<b<<endl;
//    cout<<" c = "<<c<<endl;
// }
// int main()
// {
//    sample obj;
//    obj.input(-10, 20, 30);
//    obj.display();
//    obj.operator_();
//    obj.display();
//    return 0;
// }

// define a class RESORT in cpp.

// #include<iostream>
// using namespace std;
// class resort
// {
//    private:
//    int rno;
//    char name[50];
//    float charges;
//    int days;
//    float compute();
//       public:
//          void getinfo();
//          void dispinfo();
// };
// void resort::getinfo(){
//    cout<<"Enter the room no : ";
//    cin>>rno;
//    cout<<"Enter the customer name : ";
//    cin>>name;
//    cout<<"Enter per day charges : ";
//    cin>>charges;
//    cout<<"Enter the no. of days : ";
//    cin>>days;
// }
// void resort::dispinfo(){
//    cout<<"--------Customer Details----------"<<endl;
//    cout<<"Room NO. = "<<rno<<endl;
//    cout<<"Customer Name = "<<name<<endl;
//    cout<<"Charges = "<<charges<<endl;
//    cout<<"No. of days = "<<days<<endl;
//    cout<<"Total Amount = "<<compute();
// }
// float resort::compute(){
//    float amount;
//    amount = charges*days;
//    if(amount>11000)
//       amount = 1.02*days*charges;
//       return amount;
// }
// int main()
// {
//    resort abc;
//    abc.getinfo();
//    abc.dispinfo();
//    return 0;
// }

// day-10
// create a class student.

// #include<iostream>
// using namespace std;
// class student
// {
//    private:
//    char name[50];
//    int rollno;
//    int sub1, sub2, sub3, sub4, sub5;
//    float avg;
//    public:
//       void input();
//       void compute();
//       void displau();
// };
//    void student::input(){
//       cout<<"Enter the name : ";
//       cin>>name;
//       cout<<"Enter roll no. : ";
//       cin>>rollno;
//       cout<<"Enter the five subject markes : ";
//       cin>>sub1>>sub2>>sub3>>sub4>>sub5;
//    }
//    void student::compute(){
//       avg = (sub1+sub2+sub3+sub4+sub5)/5;
//    }
//    void student::displau(){
//       cout<<"Name = "<<name<<endl;
//       cout<<"Roll no. = "<<rollno<<endl;
//       cout<<"Average Marks is = "<<avg<<endl;
//    }
// int main()
// {
//    student a;
//    a.input();
//    a.compute();
//    a.displau();
//    return 0;
// }































