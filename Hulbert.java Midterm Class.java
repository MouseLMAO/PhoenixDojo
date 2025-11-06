class Student {

    String name;
    double[] score = new double[3];

    Student(String n)
    {
        name = n;
    }

    void printInfo(){
        System.out.println(name + " scores: \nAssignment: " + score[0] + "\nMidterm: " + score[1] + "\nFinal: " + score[2]);
    }

    double calculateAverage()
    {
        double ave = ((score[0] + score[1] + score[2]) / 3);
        return ave;
    }

    void checkPass(){
        if( calculateAverage() >= 60)
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
