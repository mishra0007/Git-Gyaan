package com.jldubz.gistaviewer.model.gists;

import com.jldubz.gistaviewer.model.GitHubUser;

import java.util.Date;
import java.util.Map;

public class Gist {

    private String id;

    private Map<String,GistFile> files;

    private Date created_id;

    private Date updated_at;

    private String description;

    private GitHubUser owner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, GistFile> getFiles() {
        return files;
    }

    public void setFiles(Map<String, GistFile> files) {
        this.files = files;
    }

    public Date getCreated_id() {
        return created_id;
    }

    public void setCreated_id(Date created_id) {
        this.created_id = created_id;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GitHubUser getOwner() {
        return owner;
    }

    public void setOwner(GitHubUser owner) {
        this.owner = owner;
    }

    public Gist() {
    }


    /*
    Modified sample data from: https://developer.github.com/v3/gists/#list-a-users-gists
    {
        "id": "aa5a315d61ae9438b18d",
        "files": {
          "hello_world.rb": {

          }
        },
        "created_at": "2010-04-14T02:15:15Z",
        "updated_at": "2011-06-20T11:34:15Z",
        "description": "Hello World Examples",
        "owner": {

        }
      }
    */


}
