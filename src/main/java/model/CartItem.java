package model;


import java.io.Serializable;
import java.util.Date;

public class CartItem implements Serializable {
	private Long id;
	private Cart cart;
	private int sequence;
	private String productId;
	private Long goodsno;
	private Long sizeId;
	private String size;
	private int quantity;
	private Date addedDate;
	private Date deletedDate;
	private boolean deleteFlag;
	private boolean ordering;
}