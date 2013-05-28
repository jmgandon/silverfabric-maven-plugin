package com.tibco.silverfabric;

/**
 * User: franck
 * Date: 1/23/13
 */
public class RuntimeContextVariable {
    private String name;
    private String value;
    private String type;
    private String description;
    private String autoIncrementType;
    private String export;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAutoIncrementType() {
        return autoIncrementType;
    }

    public void setAutoIncrementType(String autoIncrementType) {
        this.autoIncrementType = autoIncrementType;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }
}
