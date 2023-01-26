package com.example.genericTable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="view_")
public class View {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "view_name")
    private String view_name;
    @Column(name = "code")
    private String code;

    public View(String view_name) {
    }

    public String getView_name() {
        return view_name;
    }

    public void setView_name(String view_name) {
        this.view_name = view_name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "View{" +
                "id=" + id +
                ", attribute_name='" + view_name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
