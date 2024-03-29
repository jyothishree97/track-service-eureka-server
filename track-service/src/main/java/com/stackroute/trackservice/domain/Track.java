package com.stackroute.trackservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Track {
    @Id
    private int id;
    private String name;
    private String comments;
//
//    public Track() {
//    }
//
//    public Track(int id, String name, String comments) {
//        this.id = id;
//        this.name = name;
//        this.comments = comments;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//
//    @Override
//    public String toString() {
//        return "Track{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", comments='" + comments + '\'' +
//                '}';
//    }
}
