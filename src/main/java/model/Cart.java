package model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Cart implements Serializable{
	private Long id;
	private Long userId;
	private Date createdDate;
	private Date modifiedDate;
	private boolean deleteFlag = false;
	private Set<CartItem> cartItem = new HashSet<>();
}
