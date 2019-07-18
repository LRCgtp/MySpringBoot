package com.hand.exam1.entity;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Film implements Serializable {

    private Integer language_id;
    private Integer original_language_id;
    private Integer rental_duration;
    private Double rental_rate;
    private Integer length;
    private Double replacement_cost;
    Enum rating;
    private Set special_features;
    private Date last_update;

    public Film(Integer language_id, Integer original_language_id, Integer rental_duration, Double rental_rate, Integer length, Double replacement_cost, Enum rating, Set special_features, Date last_update) {
        this.language_id = language_id;
        this.original_language_id = original_language_id;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        this.special_features = special_features;
        this.last_update = last_update;
    }

    public Film() {
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Integer getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(Integer original_language_id) {
        this.original_language_id = original_language_id;
    }

    public Integer getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rental_duration = rental_duration;
    }

    public Double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(Double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(Double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Enum getRating() {
        return rating;
    }

    public void setRating(Enum rating) {
        this.rating = rating;
    }

    public Set getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(Set special_features) {
        this.special_features = special_features;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Film{" +
                "language_id=" + language_id +
                ", original_language_id=" + original_language_id +
                ", rental_duration=" + rental_duration +
                ", rental_rate=" + rental_rate +
                ", length=" + length +
                ", replacement_cost=" + replacement_cost +
                ", rating=" + rating +
                ", special_features=" + special_features +
                ", last_update=" + last_update +
                '}';
    }
}
