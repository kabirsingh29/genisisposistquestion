package com.example.currentplacedetailsonmap;

import java.util.Date;

public class GenNode {

            Date timestamp;
            String data;
            Integer nodeNumber;
            String nodeId;
            String referenceNodeId;
            String[] childReferenceNodeId;
            String genesisReferenceNodeId;
            String HashValue;

            
    public GenNode(Date timestamp, String data, Integer nodeNumber, String nodeId, String referenceNodeId, String[] childReferenceNodeId, String genesisReferenceNodeId, String hashValue) {
        this.timestamp = timestamp;
        this.data = data;
        this.nodeNumber = nodeNumber;
        this.nodeId = nodeId;
        this.referenceNodeId = referenceNodeId;
        this.childReferenceNodeId = childReferenceNodeId;
        this.genesisReferenceNodeId = genesisReferenceNodeId;
        HashValue = hashValue;
    }


    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(Integer nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getReferenceNodeId() {
        return referenceNodeId;
    }

    public void setReferenceNodeId(String referenceNodeId) {
        this.referenceNodeId = referenceNodeId;
    }

    public String[] getChildReferenceNodeId() {
        return childReferenceNodeId;
    }

    public void setChildReferenceNodeId(String[] childReferenceNodeId) {
        this.childReferenceNodeId = childReferenceNodeId;
    }

    public String getGenesisReferenceNodeId() {
        return genesisReferenceNodeId;
    }

    public void setGenesisReferenceNodeId(String genesisReferenceNodeId) {
        this.genesisReferenceNodeId = genesisReferenceNodeId;
    }

    public String getHashValue() {
        return HashValue;
    }

    public void setHashValue(String hashValue) {
        HashValue = hashValue;
    }


    public static void main(String[] args)
    {
        Date timestamp1;
        String data1;
        Integer nodeNumber1;
        String nodeId1;
        String referenceNodeId1;
        String[] childReferenceNodeId1;
        String genesisReferenceNodeId1;
        String HashValue1;

        timestamp1 = null;
        data1 = null;
        nodeNumber1=null;
        nodeId1=null;
        referenceNodeId1=null;
        childReferenceNodeId1=null;
        genesisReferenceNodeId1=null;
        HashValue1=null;


        GenNode object = new GenNode(timestamp1,data1,nodeNumber1,nodeId1,referenceNodeId1,childReferenceNodeId1,genesisReferenceNodeId1,HashValue1);


    }

}

