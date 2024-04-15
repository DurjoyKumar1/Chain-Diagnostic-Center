/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

/**
 *
 * @author hp
 */
public class SalaryInfo {
    private String Employe;
    private Integer Id;
    private String AccNo;
    private String Name;
    private String amount;

    public SalaryInfo(String Employe, Integer Id, String AccNo, String Name, String amount) {
        this.Employe = Employe;
        this.Id = Id;
        this.AccNo = AccNo;
        this.Name = Name;
        this.amount = amount;
    }

    public String getEmploye() {
        return Employe;
    }

    public void setEmploye(String Employe) {
        this.Employe = Employe;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String AccNo) {
        this.AccNo = AccNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
}
