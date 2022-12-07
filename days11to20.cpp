// day 11 100daysofcodechallenge.

// constructor
// inside declaration

// #include<iostream>
// using namespace std;
// class msg
// {
//     public:
//     msg(){      // constructor example
//         cout<<"constructor example ";
//     }
// };
// int main()
// {
//     msg x;      // invoked msg() constructor automaticalluy.
//     return 0;
// }

// constructor
// outside declaration

// #include<iostream>
// using namespace std;
// class msg
// {
//     public:
//     msg();
// };
// msg::msg(){
//     cout<<"constructor example outside declaration";
// }
// int main()
// {
//     msg x;
//     return 0;
// }

// addition with the help of constructor

// #include<iostream>
// using namespace std;
// class add
// {
//     int a,b,s;
//     public:
//     add(){
//         a=12;
//         b=13;
//     }
//     void display(){
//         s=a+b;
//         cout<<"Addition of two no. = "<<s;
//     }
// };
// int main()
// {
//     add ab;
//     ab.display();
//     return 0;
// }

// calculate area of triangle with the help of consturctor.

// #include<iostream>
// using namespace std;
// class triangle
// {
//     private:
//     float tri, b, h;
//     public:
//     triangle(){
//         cout<<"Enter the value of b and h : ";
//         cin>>b>>h;
//         tri = 0.5*b*h;
//         cout<<"Area of triangle is = "<<tri;
//     }
// };
// int main()
// {
//     triangle abc;
//     return 0;
// }

// day-12 100daysofcodechallenge

// types of constructor

// #include<iostream>
// using namespace std;
// class sample
// {
//     int a, b, c;
//     public:
//     sample(){   // default constructor
//         a=10;
//     }
//     sample(int i){  // parameterized constructor
//         b=i;
//     }
//     sample(sample &t){
//         c=t.b;
//     }
//     void display(){
//         cout<<"a = "<<a<<endl;
//         cout<<"b = "<<b<<endl;
//         cout<<"c = "<<c<<endl;
//     }
// };
// int main()
// {
//     sample p;   // invoked default constructor
//     sample q(5);    // invoked parameterized constructor
//     sample r(q);    // invoked copy constructor
//     p.display();
//     q.display();
//     r.display();
//     return 0;
// }

// day-13 100daysofcodechallenge

// constructor overloading

// #include<iostream>
// using namespace std;
// class sample
// {
//     int n,m;
//     public:
//     sample(){
//         n = 0;
//         m = 0;
//     }
//     sample(int i){
//         n = i;
//         m = i;
//     }
//     sample(int i, int j){
//         n = i;
//         m = j;
//     }
//     void display(){
//         cout<<"n = "<<n<<endl;
//         cout<<"m = "<<m<<endl;
//     }
// };
// int main()
// {
//     sample x;
//     sample y(10);
//     sample z(10, 20);
//     cout<<"x"<<endl;
//     x.display();
//     cout<<"y"<<endl;
//     y.display();
//     cout<<"z"<<endl;
//     z.display();
//     return 0;
// }

// day-14 100daysofcodechallenge

// Dynamic initialization of object

// #include<iostream>
// using namespace std;
// class sample
// {
//     int a, b;
//     public:
//         sample(int i, int j){
//             a = i;
//             b = j;
//         }
//         void display(){
//             cout<<"a = "<<a<<endl;
//             cout<<"b = "<<b<<endl;
//         }
// };
// int main()
// {
//     int a, b;
//     cout<<"Enter two integer values : ";
//     cin>>a>>b;
//     sample obj(a,b);
//     obj.display();
//     return 0;
// }

// Destructor

// #include<iostream>
// using namespace std;
// class sample
// {
//     int a, b;
//         public:
//             sample(){   // constructor
//                 a = 10;
//                 b = 20;
//             }
//             ~sample(){  // destructor
//                 cout<<"a = "<<a<<endl;
//                 cout<<"b = "<<b<<endl;
//             }
// };
// int main()
// {
//     sample abc;
//     return 0;
// }

// day-15 100daysofcodechallenge

// Inheritance

/* W.A.P in cpp to illustrate access control of inherited
   member in the privatel derived class. */

// #include <iostream>
// #include <stdio.h>
// using namespace std;
// class employee
// {
//     private:
//         char name[30];
//         int idno;
//     public:
//         void get_data()
//         {
//             cout << "Enter Employee Name : ";
//             gets(name);
//             cout << "Enter Employee Id no. : ";
//             cin >> idno;
//         }
//         void put_data()
//         {
//             cout << "\nEmployee Name : ";
//             puts(name);
//             cout << "Employee Id no. : "<<idno;
//             cout << "\nBasic Salary : " << basic;
//         }
//     protected:
//         float basic;
//         void get_basic()
//         {
//             cout << "Enter Employee Basic Salary : ";
//             cin >> basic;
//         }
// };
// class manager:private employee{
//     private:
//         char title[10];
//     public:
//         void get_data(){
//             employee::get_data();
//             get_basic();
//             cout<<"Enter Employee title : "; // not gets inpute value 
//             gets(title);                    // what is the problem
//         }                                    // Please comment
//         void put_data(){
//             employee::put_data();
//             cout<<"\nEmployee Title : ";
//             puts(title);
//         }
// };
// int main()
// {
//     manager m1, m2;
//     cout<<"\nManager1 "<<endl;
//     m1.get_data();
//     cout<<"\nManager2 "<<endl;
//     m2.get_data();
//     cout<<"Manager1 Information  "<<endl;
//     m1.put_data();
//     cout<<"Manager2 Information  "<<endl;
//     m2.put_data();
//     return 0;
// }

// function overloading method overriding

// #include<iostream>
// using namespace std;
// class sample
// {
//     public:
//         void display(){
//             cout<<"Class base "<<endl;
//         }
// };
// class demo:public sample
// {
//     public:
//         void display(){
//             sample::display();
//             cout<<"Class derived ";
//         }
// };
// int main()
// {
//     demo abc;
//     abc.display();
//     return 0;
// }

// single inheritance

// #include<iostream>
// using namespace std;
// class a
// {
//     public:
//         void display1(){
//             cout<<"Class A "<<endl;
//         }
// };
// class b:public a
// {
//     public:
//         void display2(){
//             cout<<"Class B ";
//         }
// };
// int main()
// {
//     b abc;
//     abc.display1();
//     abc.display2();
//     return 0;
// }

// multilevel inheritance

// #include<iostream>
// using namespace std;
// class A
// {
//     public:
//         void display1(){
//             cout<<"Class A "<<endl;
//         }
// };
// class B:private A
// {
//     public:
//         void display2(){
//             display1();
//             cout<<"Class B "<<endl;
//         }
// };
// class C:public B
// {
//     public:
//         void display3(){
//             cout<<"Class C ";
//         }
// };
// int main()
// {
//     C abc;
//     abc.display2();
//     abc.display3();
//     return 0;
// }

// day-16 100daysofcodechallenge

// multiple inheritance

// #include<iostream>
// using namespace std;
// class A
// {
//     public:
//         void display1(){
//             cout<<"Class A "<<endl;
//         }
// };
// class B
// {
//     public:
//         void display2(){
//             cout<<"Class B "<<endl;
//         }
// };
// class C:public A, public B
// {
//     public:
//         void display3(){
//             cout<<"Class C ";
//         }
// };
// int main()
// {
//     C abc;
//     abc.display1();
//     abc.display2();
//     abc.display3();
//     return 0;
// }

// hybrid inheritance

// #include<iostream>
// using namespace std;
// class A
// {
//     public:
//         void display1(){
//             cout<<"Class A "<<endl;
//         }
// };
// class B:public virtual A
// {
//     public:
//         void display2(){
//             cout<<"Class B "<<endl;
//         }
// };
// class C:public virtual A
// {
//     public:
//         void display3(){
//             cout<<"Class C "<<endl;
//         }
// };
// class D:public B, public C
// {
//     public:
//         void display4(){
//             cout<<"Class D "<<endl;
//         }
// };
// int main()
// {
//     D xyz;
//     xyz.display1();
//     xyz.display2();
//     xyz.display3();
//     xyz.display4();
//     return 0;
// }

// hierarchial inheritance

// #include<iostream>
// using namespace std;
// class A
// {
//     public:
//         void display1(){
//             cout<<"Class A "<<endl;
//         }
// };
// class B:public A
// {
//     public:
//         void display2(){
//             cout<<"Class B "<<endl;
//         }
// };
// class C:public A
// {
//     public:
//         void display3(){
//             cout<<"Class C "<<endl;
//         }
// };
// int main()
// {
//     B obj;
//     C abc;
//     obj.display1();
//     obj.display2();
//     abc.display1();
//     abc.display3();
//     return 0;
// }

// day-17 100daysofcodechallenge

// constructor in multiple inheritance

// #include<iostream>
// using namespace std;
// class base1
// {
//    int n;
//    public:
//       base1(int i){
//          n=i;
//       }
//       void display1(){
//          cout<<"n = "<<n<<endl;
//       }
// };
// class base2
// {
//    float f;
//    public:
//       base2(float i){
//          f=i;
//       }
//       void display2(){
//          cout<<"f = "<<f<<endl;
//       }
// };
// class derived:public base1, public base2
// {
//    int c;
//    public:
//       derived(int i, float j, int k):base1(i), base2(j){
//          c=k;
//       }
//       void display3(){
//          cout<<"c = "<<c;
//       }
// };
// int main()
// {
//    derived abc(5, 6.5, 9);
//    abc.display1();   //5
//    abc.display2();   //6.5
//    abc.display3();   // 9
//    return 0;
// }

// virtual base class 

// #include<iostream>
// using namespace std;
// class A
// {
//    public:
//       void display(){
//          cout<<"Class A "<<endl;
//       }
// };
// class B:virtual public A
// {
//    public:
//       void display1(){
//          cout<<"Class B "<<endl;
//       }
// };
// class C:virtual public A
// {
//    public:
//       void display2(){
//          cout<<"Class C "<<endl;
//       }
// };
// class D:public B, public C
// {
//    public:
//       void display3(){
//          cout<<"Class D ";
//       }
// };
// int main()
// {
//    D abc;
//    abc.display();
//    abc.display1();
//    abc.display2();
//    abc.display3();
//    return 0;
// }

// day-18 100daysofcodechallenge

// Pointer || dynamic array

// #include<iostream>
// using namespace std;
// int main()
// {
//    int s;
//    cout<<"Enter number of student ";
//    cin>>s;
//    int*rollno = new int[s]; // dynamic allocate rollno array
//    int*marks = new int[s]; // dynamic allocate marks array
//    int i;
//    for(i=0; i<s; i++){
//       cout<<"Enter Roll no. : ";
//       cin>>rollno[i];
//       cout<<"Enter Marks : ";
//       cin>>marks[i];
//    }
//    cout<<"\nRoll no.\tMarks \n";
//    for(i=0; i<s; i++){
//       cout<<rollno[i]<<"\t\t"<<marks[i]<<"\n";
//    }
//    delete[]rollno;
//    delete[]marks;
//    return 0;
// }

// employee

// #include<iostream>
// using namespace std;
// int main()
// {
//    int s, sum = 0, avg;
//    cout<<"Enter number of employee : ";
//    cin>>s;
//    int*salary = new int[s];
//    for(int i=0; i<s; i++){
//       cout<<"Enter salary : ";
//       cin>>salary[i];
//    }
//    for (int i = 0; i < s; i++)
//    {
//       sum = sum + salary[i];
//    }
//    avg = sum/s;
//    cout<<"Average = "<<avg;
//    delete[]salary;   
//    return 0;
// }

// Pointer and object

// #include<iostream>
// using namespace std;
// class member
// {
//    int n;
//    float f;
//    public:
//       void input(){
//          cout<<"Enter one integer value : ";
//          cin>>n;
//          cout<<"Enter one float value : ";
//          cin>>f;
//       }
//       void display(){
//          cout<<"\n n = "<<n<<endl;
//          cout<<" f = "<<f;
//       }
// };
// int main()
// {
//    member x, *p;
//    p=&x;
//    p->input();
//    p->display();
//    return 0;
// }

// this pointer

// #include<iostream>
// using namespace std;
// class test
// {
//    int a, b;
//    public:
//       void input(int a, int b){
//          this->a=a;
//          this->b=b;
//       }
//       void show(){
//          cout<<"\n a = "<<a<<endl;
//          cout<<" b = "<<b<<endl;
//          cout<<" Object Address = "<<this;
//       }
// };
// int main()
// {
//    test abc;
//    abc.input(2, 4);
//    abc.show();
//    return 0;
// }

/* Program to read some marks of some student and display it. */

// #include<iostream>
// using namespace std;
// int main()
// {
//    int p, s;
//    cout<<"Enter number of papers : ";
//    cin>>p;
//    cout<<"Enter number of student : ";
//    cin>>s;
//    int*m = new int[s*p];
//    for (int i = 0; i < s; i++)
//    {
//       cout<<"Enter marks of "<<i<<" the index student "<<endl;
//       for (int j = 0; j < p; j++)
//       {
//          cin>>m[i*p+j];
//       }
//    }
//    for (int i = 0; i < s; i++)
//    {
//       for (int j = 0; j < p; j++)
//       {
//          cout<<m[i*p+j]<<"\t";
//       }
//       cout<<"\n";
//    }
//    delete[]m;   
//    return 0;
// }

// day-19 100daysofcodechallenge

// Pointer and structure

// #include<iostream>
// using namespace std;
// struct student
// {
//    int rollno;
//    char name[30];
//    int marks;
// };
// int main()
// {
//    student s1, s2;
//    student *p1, *p2;
//    p1 = &s1;
//    p2 = &s2;
//    cout<<"Enter rollno of 1st student : ";
//    cin>>p1->rollno;
//    cout<<"Enter Name of 1st student : ";
//    cin>>p1->name;
//    cout<<"Enter Marks of 1st student : ";
//    cin>>p1->marks;
//    cout<<"Enter rollno of 2st student : ";
//    cin>>p2->rollno;
//    cout<<"Enter Name of 2st student : ";
//    cin>>p2->name;
//    cout<<"Enter Marks of 2st student : ";
//    cin>>p2->marks;
//    cout<<"\nRoll no. of 1st student = "<<p1->rollno<<endl;
//    cout<<"Name of 1st student = "<<p1->name<<endl;
//    cout<<"Marks of 1st student = "<<p1->marks<<endl;
//    cout<<"\nRoll no. of 2st student = "<<p2->rollno<<endl;
//    cout<<"Name of 2st student = "<<p2->name<<endl;
//    cout<<"Marks of 2st student = "<<p2->marks<<endl;
//    return 0;
// }

// Pointer of function
// swap value

// #include<iostream>
// using namespace std;
// void swap(int &, int &);
// int main()
// {
//    int a=7, b=4;
//    cout<<"\n Original Values "<<endl;
//    cout<<" a = "<<a<<endl;
//    cout<<" b = "<<b<<endl;
//    cout<<"\n Swapped Values "<<endl;
//    swap(a, b);
//    cout<<" a = "<<a<<endl;
//    cout<<" b = "<<b<<endl;
//    return 0;
// }
// void swap(int &x, int &y){
//    int t;
//    t=x;
//    x=y;
//    y=t;
// }

// day-20 100daysofcodechallenge

// Array of pointer 

// #include<iostream>
// using namespace std;
// int main()
// {
//    int *p[5], i;
//    int a=65, b=67, c=69, d=70, e=75;
//    p[0]=&a;
//    p[1]=&b;
//    p[2]=&c;
//    p[3]=&d;
//    p[4]=&e;
//    cout<<"Displaying value of pointer array "<<endl;
//    for(i=0; i<4; i++){
//       cout<<*p[i]<<"\t";
//    }
//    cout<<"\nDisplaying address of pointer array "<<endl;
//    for ( i = 0; i < 4; i++)
//    {
//       cout<<p[i]<<"\t";
//    }   
//    return 0;
// }

// Function returning pointer 

// #include<iostream>
// using namespace std;
// int *big(int &, int &);
// int main()
// {
//    int a, b, *c;
//    cout<<"Enter two integers value : ";
//    cin>>a>>b;
//    c=big(a, b);
//    cout<<"The bigger value is "<<*c<<endl;
//    return 0;
// }
// int *big(int &x, int &y){
//    if(x>y)
//    return (&x);
//    else
//    return (&y);
// }

// Pointer of Pointer 

// #include<iostream>
// using namespace std;
// int main()
// {
//    int *p, **pp, n=100;
//    p=&n;
//    pp=&p;
//    cout<<"Value of n = "<<n<<endl;
//    cout<<"Value of n = "<<*p<<endl;
//    cout<<"Value of n = "<<**pp<<endl;
//    cout<<"Value of n = "<<&n<<endl;
//    cout<<"Value of n = "<<p<<endl;
//    cout<<"Value of n = "<<&p<<endl;
//    cout<<"Value of n = "<<pp<<endl;
//    cout<<"Value of n = "<<&pp<<endl;
//    return 0;
// }

// Pointer Arithmetic 

// #include<iostream>
// using namespace std;
// int main()
// {
//    int a=40;
//    int *p;
//    p=&a;
//    cout<<*p<<endl;
//    cout<<p<<endl;
//    cout<<p+1<<endl;
//    cout<<p+2<<endl;
//    cout<<p+4<<endl;
//    char *c;
//    cout<<c+1<<endl;
//    cout<<c+3<<endl;
//    cout<<c+6<<endl;
//    return 0;
// }






