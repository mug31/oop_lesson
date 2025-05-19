package practicum_polimorfism;

abstract class alatMusik{
    
    protected abstract void sound();
}

class piano extends alatMusik{

    protected void sound(){
        System.out.println("suara alat piano : teneneng teneng tenenng");
        System.out.println();
    }
}
class biola extends alatMusik{

    protected void sound(){
        System.out.println("suara biola : nyit nyitt nyitt");
        System.out.println();
    }
}
class drum extends alatMusik{

    protected void sound(){
        System.out.println("suara drum : bedem tass!");
        System.out.println();
    }
}
class saxophone extends alatMusik{
    
    protected void sound(){
        System.out.println("suara saxophone : puffffft");
        System.out.println();
    }
}
class trumpet extends alatMusik{
   
    protected void sound(){
        System.out.println("suara trumpet : teretereterettt");
        System.out.println();
    }
}
class gitar extends alatMusik{
   
    protected void sound(){
        System.out.println("suara gitar : jreng gejrenggg");
        System.out.println();
    }
}

class print {
    public static void main(String[] args) {
        alatMusik piano = new piano();
        alatMusik biola = new biola();
        alatMusik gitar = new gitar();
        alatMusik drum = new drum();
        alatMusik trumpet = new trumpet();
        alatMusik saxophone = new saxophone();
        piano.sound();
        biola.sound();
        gitar.sound();
        drum.sound();
        trumpet.sound();
        saxophone.sound();
    }
}