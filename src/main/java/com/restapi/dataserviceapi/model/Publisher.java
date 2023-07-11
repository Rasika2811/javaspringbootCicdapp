package com.restapi.dataserviceapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="publisher")
public class Publisher {
    @GeneratedValue
    @Id
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String apikey;
    public Publisher() {
    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }




    @Override
    public String toString() {
        return "Publisher [id=" + id + ", name=" + fname + ",]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publisher")
public class Publisher {

    public Publisher() {
        // TODO Auto-generated constructor stub
    }

    @Id
    @GeneratedValue
    private int id;
    private String fname;

    //	private String apikey;
//	private String identifier;
//	private String description;
//	private String Notes;
//	private String passwd;
//	private String lastlogin;
    private String addtime;
    private String email;
    //	private String phone;
//	private String mobile;
    private String currency;
    //	private String address1;
//	private String address2;
    private String country;


    //	private String city;
//	private String legal_name;
    private String company_name;
//	private int advertiser_id;
////	private String acc_type;
////	private String pub_network_type;
//	//private String supply_type;
//	private Enum price_settle_method	;
//	private String network_type;
//	private String network_code;
//	private int is_seller_json_enabled;
//	private int is_truncated_ip_enabled;




    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }


    public Publisher(int id, String fname, String lname, String addtime, String email, String currency,
                     String company_name) {
        super();
        this.id = id;
        this.fname = fname;
        this.country = country;
        this.addtime = addtime;
        this.email = email;
        this.currency = currency;
        this.company_name = company_name;
    }

    @Override
    public String toString() {
        return "Publisher [id=" + id + ", name=" + fname + ",]";
    }


}
*/