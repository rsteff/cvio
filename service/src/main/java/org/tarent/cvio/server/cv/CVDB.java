package org.tarent.cvio.server.cv;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

public interface CVDB {

	/**
	 * Returns the CVs.
	 * @param fields list of fields to return in the answer
	 * @return List of Maps with the requested fields and a special field '_id' for the document id.
	 */
	public List<Map<String,String>> getAllCVs(String[] fields);

	/**
	 * Creates a CV with the supplied JSON-Document
	 * 
	 * @param content
	 * @return returns the id if the document
	 */
	public String createCV(String content);

	/**
	 * Returns one cv by its id
	 * @param id
	 * @return the CV as JSON String
	 */
	public String getCVById(String id);

	/**
	 * Stores the new content of the cv.
	 */
	void updateCV(String id, String content);

}