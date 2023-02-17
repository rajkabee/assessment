package com.example.demo.entities;

import java.sql.Date;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="news")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long newsId;
	private String newstitle;
	private String newsBody;
	@ManyToOne
	private User author;
	@CreationTimestamp
	private Timestamp createdTimestamp;
	@UpdateTimestamp
	private Timestamp lastUpdated;
}
