public class stuff {
    protected int code;
    protected String name;
}

class Teacher extends stuff{
    String subject;
    String publication;
}

class officer extends stuff{
    int grade;
}

class Typist extends stuff{
    String speed;
}

class Regular extends Typist{
    int dailyWages;
}

class casual extends Typist{
    int dailyWages;
}


class mainstuff{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.code = 77;
        t.name = "Ashike";
        t.subject = "Math";
        t.publication = "Bangla Academy";
        System.out.println("code = "+t.code+", name = "+t.name+", subject = "+t.subject+", publication ="+t.publication);


        officer o = new officer();
        o.code = 75;
        o.name = "Rafi";
        o.grade = 01;
        System.out.println("code = "+o.code+", name = "+o.name+", grade = "+o.grade);

        Typist ty = new Typist();
        ty.code = 73;
        ty.name = "Rayhan";
        ty.speed = "75 words per minute";
        System.out.println("code = "+ty.code+", name = "+ty.name+", speed = "+ty.speed);


        Regular r = new Regular();
        r.code = 71;
        r.name = "Riad";
        r.speed = "70 words per minute";
        r.dailyWages = 100;
        System.out.println("code = "+r.code+", name = "+r.name+", speed = "+r.speed+", daily wages = "+r.dailyWages);

        casual c = new casual();
        c.code = 70;
        c.name = "Rahaz";
        c.speed = "65 words per minute";
        c.dailyWages = 80;
        System.out.println("code = "+c.code+", name = "+c.name+", speed = "+c.speed+", daily wages = "+c.dailyWages);

    }
}


