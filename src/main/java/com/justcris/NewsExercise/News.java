package com.justcris.NewsExercise;

public class News {
    private int _id;
    private String _title;
    private String _description;
    private String _date;

    public News() {
    }

    public News(int _id, String _title, String _description, String _date) {
        this._id = _id;
        this._title = _title;
        this._description = _description;
        this._date = _date;
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public String get_date() {
        return _date;
    }

    public void set_date(String _date) {
        this._date = _date;
    }
}
