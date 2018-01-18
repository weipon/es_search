package com.cassandra.test;


import java.time.LocalDateTime;
import java.util.List;

public class BackCategory {

    private Long id;

    private String name;

    private Long parentId;

    private String pathName;

    private Integer lev;

    private String dataStatus;

    private List<BackCategory> children;

    private BackCategory parents;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime removedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public List<BackCategory> getChildren() {
        return children;
    }

    public void setChildren(List<BackCategory> children) {
        this.children = children;
    }

    public BackCategory getParents() {
        return parents;
    }

    public void setParents(BackCategory parents) {
        this.parents = parents;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getRemovedAt() {
        return removedAt;
    }

    public void setRemovedAt(LocalDateTime removedAt) {
        this.removedAt = removedAt;
    }

    @Override
    public String toString() {
        return "BackCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", pathName='" + pathName + '\'' +
                ", lev=" + lev +
                ", dataStatus=" + dataStatus +
                ", children=" + children +
                ", parents=" + parents +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", removedAt=" + removedAt +
                '}';
    }
}
