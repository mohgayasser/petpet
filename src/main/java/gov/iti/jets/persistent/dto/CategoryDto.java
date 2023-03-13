package gov.iti.jets.persistent.dto;

public class CategoryDto {
  
    private Integer id;

    private Integer parentId;

    private String name;



    public CategoryDto() {
    }

    public CategoryDto(Integer id, Integer parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CategoryDto [id=" + id + ", parentId=" + parentId + ", name=" + name + "]";
    }


    
}
