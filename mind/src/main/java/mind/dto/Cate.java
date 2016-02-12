package mind.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jw_cate")
public class Cate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6030346113747932099L;
	
	@Id
	private String id;
	@Column (length=100)
	private String value;
	@Column (length=2)
	private String use_yn;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	
}
