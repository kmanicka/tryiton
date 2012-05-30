package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class TIOImage extends Model {
	public String title;
	public String imageUrl;

	public TIOImage( String title, String imageUrl) {
		super();
		this.title = title;
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return imageUrl;
	}

}





