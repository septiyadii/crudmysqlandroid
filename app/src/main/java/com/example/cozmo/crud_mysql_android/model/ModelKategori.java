package com.example.cozmo.crud_mysql_android.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ModelKategori{

	@SerializedName("DataKategori")
	private List<DataKategoriItem> dataKategori;

	public void setDataKategori(List<DataKategoriItem> dataKategori){
		this.dataKategori = dataKategori;
	}

	public List<DataKategoriItem> getDataKategori(){
		return dataKategori;
	}
}