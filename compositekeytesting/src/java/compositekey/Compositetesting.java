package compositekey;
// Generated Apr 2, 2015 2:25:18 PM by Hibernate Tools 4.3.1



/**
 * Compositetesting generated by hbm2java
 */
public class Compositetesting  implements java.io.Serializable {


     private CompositetestingId id;
     private Integer id_1;
     private Integer salary;

    public Compositetesting() {
    }

	
    public Compositetesting(CompositetestingId id) {
        this.id = id;
    }
    public Compositetesting(CompositetestingId id, Integer id_1, Integer salary) {
       this.id = id;
       this.id_1 = id_1;
       this.salary = salary;
    }
   
    public CompositetestingId getId() {
        return this.id;
    }
    
    public void setId(CompositetestingId id) {
        this.id = id;
    }
    public Integer getId_1() {
        return this.id_1;
    }
    
    public void setId_1(Integer id_1) {
        this.id_1 = id_1;
    }
    public Integer getSalary() {
        return this.salary;
    }
    
    public void setSalary(Integer salary) {
        this.salary = salary;
    }




}


