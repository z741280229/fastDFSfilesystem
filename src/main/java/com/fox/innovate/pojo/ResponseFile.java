package com.fox.innovate.pojo;

import java.util.List;

public class ResponseFile{
    private String time;

    private List<File> files;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
