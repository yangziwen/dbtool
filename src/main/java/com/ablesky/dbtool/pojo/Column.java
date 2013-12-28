package com.ablesky.dbtool.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Column {
	
	private String tableSchema;
	private String tableName;
	private String columnName;
	private Integer ordinalPosition;
	private String columnDefault;
	private String isNullable;
	private String dataType;
	private Long characterMaximumLength;
	private Long characterOctetLength;
	private BigDecimal numericPrecision;
	private Long numericScale;
	private String characterSetName;
	private String collationName;
	private String columnType;
	private String columnKey;
	private String extra;
	private String columnComment;
	
	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Integer getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(Integer ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	public String getColumnDefault() {
		return columnDefault;
	}

	public void setColumnDefault(String columnDefault) {
		this.columnDefault = columnDefault;
	}

	public String getIsNullable() {
		return isNullable;
	}

	public void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Long getCharacterMaximumLength() {
		return characterMaximumLength;
	}

	public void setCharacterMaximumLength(Long characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}

	public Long getCharacterOctetLength() {
		return characterOctetLength;
	}

	public void setCharacterOctetLength(Long characterOctetLength) {
		this.characterOctetLength = characterOctetLength;
	}

	public BigDecimal getNumericPrecision() {
		return numericPrecision;
	}

	public void setNumericPrecision(BigDecimal numericPrecision) {
		this.numericPrecision = numericPrecision;
	}

	public Long getNumericScale() {
		return numericScale;
	}

	public void setNumericScale(Long numericScale) {
		this.numericScale = numericScale;
	}

	public String getCharacterSetName() {
		return characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public String getCollationName() {
		return collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getColumnKey() {
		return columnKey;
	}

	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	@Override
	public String toString() {
		return this.tableSchema + "." + this.tableName + "." + this.columnName + ": " + this.columnType + " DEFAULT " + this.columnDefault;
	}

	public static enum ColumnField {
		TABLE_SCHEMA,
		TABLE_NAME,
		COLUMN_NAME,
		ORDINAL_POSITION,
		COLUMN_DEFAULT,
		IS_NULLABLE,
		DATA_TYPE,
		CHARACTER_MAXIMUM_LENGTH,
		CHARACTER_OCTET_LENGTH,
		NUMERIC_PRECISION,
		NUMERIC_SCALE,
		CHARACTER_SET_NAME,
		COLLATION_NAME,
		COLUMN_TYPE,
		COLUMN_KEY,
		EXTRA,
		COLUMN_COMMENT
		;
	}
	
	public static class ColumnRowMapper implements RowMapper<Column>  {
		@Override
		public Column mapRow(ResultSet rs, int rowNum) throws SQLException {
			Column column = new Column();
			column.setTableSchema(rs.getString(ColumnField.TABLE_SCHEMA.name()));
			column.setTableName(rs.getString(ColumnField.TABLE_NAME.name()));
			column.setColumnName(rs.getString(ColumnField.COLUMN_NAME.name()));
			column.setOrdinalPosition(rs.getInt(ColumnField.ORDINAL_POSITION.name()));
			column.setColumnDefault(rs.getString(ColumnField.COLUMN_DEFAULT.name()));
			column.setIsNullable(rs.getString(ColumnField.IS_NULLABLE.name()));
			column.setDataType(rs.getString(ColumnField.DATA_TYPE.name()));
			column.setCharacterMaximumLength(rs.getLong(ColumnField.CHARACTER_MAXIMUM_LENGTH.name()));
			column.setCharacterOctetLength(rs.getLong(ColumnField.CHARACTER_OCTET_LENGTH.name()));
			column.setNumericPrecision(rs.getBigDecimal(ColumnField.NUMERIC_PRECISION.name()));
			column.setNumericScale(rs.getLong(ColumnField.NUMERIC_SCALE.name()));
			column.setCharacterSetName(rs.getString(ColumnField.CHARACTER_SET_NAME.name()));
			column.setCollationName(rs.getString(ColumnField.COLLATION_NAME.name()));
			column.setColumnType(rs.getString(ColumnField.COLUMN_TYPE.name()));
			column.setColumnKey(rs.getString(ColumnField.COLUMN_KEY.name()));
			column.setExtra(rs.getString(ColumnField.EXTRA.name()));
			column.setColumnComment(rs.getString(ColumnField.COLUMN_COMMENT.name()));
			return column;
		}
		
	}
}