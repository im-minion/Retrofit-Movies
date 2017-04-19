
package in.vaibhav.com.retrofit_movies.model;

import com.google.gson.annotations.SerializedName;

public class ProductionCompany {

    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private Integer id;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProductionCompany() {
    }

    /**
     *
     * @param id
     * @param name
     */
    public ProductionCompany(String name, Integer id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}