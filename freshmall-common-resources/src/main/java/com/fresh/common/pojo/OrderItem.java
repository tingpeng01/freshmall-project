package com.fresh.common.pojo;

public class OrderItem {
	private Long id;
	private String orderId;
	private String pid;
	private Integer num;
	private String pphoto;
	private String pname;
	private Double pscprice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPphoto() {
        return pphoto;
    }

    public void setPphoto(String pphoto) {
        this.pphoto = pphoto;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPscprice() {
        return pscprice;
    }

    public void setPscprice(Double pscprice) {
        this.pscprice = pscprice;
    }
}
