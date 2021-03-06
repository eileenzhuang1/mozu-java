/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Order Notes subresource to manage merchant-level notes associated with an active order.
 * </summary>
 */
public class OrderNoteClient {
	
	/**
	 * Retrieves a list of all notes for an order.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> mozuClient=GetOrderNotesClient( orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderNote orderNote = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public static MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> getOrderNotesClient(String orderId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderNoteUrl.getOrderNotesUrl(orderId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.commerceruntime.orders.OrderNote>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.commerceruntime.orders.OrderNote>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a specific order note.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient=GetOrderNoteClient( orderId,  noteId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderNote orderNote = client.Result();
	 * </code></pre></p>
	 * @param noteId Unique identifier of the order note to retrieve.
	 * @param orderId Unique identifier of the order associated with the note.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> getOrderNoteClient(String orderId, String noteId) throws Exception
	{
		return getOrderNoteClient( orderId,  noteId,  null);
	}

	/**
	 * Retrieves the details of a specific order note.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient=GetOrderNoteClient( orderId,  noteId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderNote orderNote = client.Result();
	 * </code></pre></p>
	 * @param noteId Unique identifier of the order note to retrieve.
	 * @param orderId Unique identifier of the order associated with the note.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> getOrderNoteClient(String orderId, String noteId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderNoteUrl.getOrderNoteUrl(noteId, orderId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderNote.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new merchant note for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient=CreateOrderNoteClient( orderNote,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderNote orderNote = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to add a note.
	 * @param orderNote The alphanumeric text contained in the note. The maximum length is 256 characters.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> createOrderNoteClient(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId) throws Exception
	{
		return createOrderNoteClient( orderNote,  orderId,  null);
	}

	/**
	 * Creates a new merchant note for the specified order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient=CreateOrderNoteClient( orderNote,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderNote orderNote = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order for which to add a note.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param orderNote The alphanumeric text contained in the note. The maximum length is 256 characters.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> createOrderNoteClient(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderNoteUrl.createOrderNoteUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderNote.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderNote);
		return mozuClient;

	}

	/**
	 * Updates a specific note for an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient=UpdateOrderNoteClient( orderNote,  orderId,  noteId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderNote orderNote = client.Result();
	 * </code></pre></p>
	 * @param noteId Unique identifier of the order note.
	 * @param orderId Unique identifier of the order.
	 * @param orderNote The content of the order note. The maximum length is 256 characters.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> updateOrderNoteClient(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId) throws Exception
	{
		return updateOrderNoteClient( orderNote,  orderId,  noteId,  null);
	}

	/**
	 * Updates a specific note for an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient=UpdateOrderNoteClient( orderNote,  orderId,  noteId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * OrderNote orderNote = client.Result();
	 * </code></pre></p>
	 * @param noteId Unique identifier of the order note.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param orderNote The content of the order note. The maximum length is 256 characters.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.orders.OrderNote>
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderNote
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> updateOrderNoteClient(com.mozu.api.contracts.commerceruntime.orders.OrderNote orderNote, String orderId, String noteId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderNoteUrl.updateOrderNoteUrl(noteId, orderId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.orders.OrderNote.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderNote> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(orderNote);
		return mozuClient;

	}

	/**
	 * Deletes the specified order note.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteOrderNoteClient( orderId,  noteId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param noteId Unique identifier of the order note to delete.
	 * @param orderId Unique identifier of the order associated with the note.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteOrderNoteClient(String orderId, String noteId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.OrderNoteUrl.deleteOrderNoteUrl(noteId, orderId);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



