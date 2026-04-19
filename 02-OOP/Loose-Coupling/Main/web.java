package Main;
import Service.Icourse;

public class Web {
private Icourse course;
public void setcourse(Icourse course) {
    this.course = course;
}
boolean display(){
    course.Registered();
    return true;
}
}
