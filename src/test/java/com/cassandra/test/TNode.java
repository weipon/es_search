package com.cassandra.test;

import java.util.List;

/**
 * Created by weipon on 17/5/9.
 */
public class TNode {
    private static final long serialVersionUID = -2721191232926604726L;

    private int id;

    private int parentId;

    private List children;

    private String name;

    private int level;


    private boolean isLeaf;


    public TNode() {
        super();
    }

    public TNode(int id, int parentId, String name, int level) {
        super();
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }


    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + parentId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TNode other = (TNode) obj;
        if (id != other.id)
            return false;
        if (parentId != other.parentId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Node {id=" + id + ", parentId=" + parentId + ", children="
                + children + ", name=" + name + ", level =" + level + "}";
    }
}
