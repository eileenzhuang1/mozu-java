/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.credits;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Customer Credit Transactions subresource to manage the individual transactions performed using a store credit or gift card.
 * </summary>
 */
public class CreditTransactionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CreditTransactionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of the transactions performed using a customer credit that update the balance of the credit.
	 * <p><pre><code>
	 *	CreditTransaction credittransaction = new CreditTransaction();
	 *	CreditTransactionCollection creditTransactionCollection = credittransaction.getTransactions( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditTransactionCollection getTransactions(String code) throws Exception
	{
		return getTransactions( code,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the transactions performed using a customer credit that update the balance of the credit.
	 * <p><pre><code>
	 *	CreditTransaction credittransaction = new CreditTransaction();
	 *	CountDownLatch latch = credittransaction.getTransactions( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 */
	public CountDownLatch getTransactionsAsync(String code, AsyncCallback<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> callback) throws Exception
	{
		return getTransactionsAsync( code,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a list of the transactions performed using a customer credit that update the balance of the credit.
	 * <p><pre><code>
	 *	CreditTransaction credittransaction = new CreditTransaction();
	 *	CreditTransactionCollection creditTransactionCollection = credittransaction.getTransactions( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditTransactionCollection getTransactions(String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> client = com.mozu.api.clients.commerce.customer.credits.CreditTransactionClient.getTransactionsClient( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the transactions performed using a customer credit that update the balance of the credit.
	 * <p><pre><code>
	 *	CreditTransaction credittransaction = new CreditTransaction();
	 *	CountDownLatch latch = credittransaction.getTransactions( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditTransactionCollection
	 */
	public CountDownLatch getTransactionsAsync(String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditTransactionCollection> client = com.mozu.api.clients.commerce.customer.credits.CreditTransactionClient.getTransactionsClient( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new transaction and updates the amount of a store credit or gift card.
	 * <p><pre><code>
	 *	CreditTransaction credittransaction = new CreditTransaction();
	 *	CreditTransaction creditTransaction = credittransaction.addTransaction( creditTransaction,  code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param creditTransaction Properties of a transaction performed for a customer credit that update the remaining balance of the credit.
	 * @return com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 */
	public com.mozu.api.contracts.customer.credit.CreditTransaction addTransaction(com.mozu.api.contracts.customer.credit.CreditTransaction creditTransaction, String code) throws Exception
	{
		return addTransaction( creditTransaction,  code,  null);
	}

	/**
	 * Creates a new transaction and updates the amount of a store credit or gift card.
	 * <p><pre><code>
	 *	CreditTransaction credittransaction = new CreditTransaction();
	 *	CountDownLatch latch = credittransaction.addTransaction( creditTransaction,  code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param  callback callback handler for asynchronous operations
	 * @param creditTransaction Properties of a transaction performed for a customer credit that update the remaining balance of the credit.
	 * @return com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 */
	public CountDownLatch addTransactionAsync(com.mozu.api.contracts.customer.credit.CreditTransaction creditTransaction, String code, AsyncCallback<com.mozu.api.contracts.customer.credit.CreditTransaction> callback) throws Exception
	{
		return addTransactionAsync( creditTransaction,  code,  null, callback);
	}

	/**
	 * Creates a new transaction and updates the amount of a store credit or gift card.
	 * <p><pre><code>
	 *	CreditTransaction credittransaction = new CreditTransaction();
	 *	CreditTransaction creditTransaction = credittransaction.addTransaction( creditTransaction,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param creditTransaction Properties of a transaction performed for a customer credit that update the remaining balance of the credit.
	 * @return com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 */
	public com.mozu.api.contracts.customer.credit.CreditTransaction addTransaction(com.mozu.api.contracts.customer.credit.CreditTransaction creditTransaction, String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditTransaction> client = com.mozu.api.clients.commerce.customer.credits.CreditTransactionClient.addTransactionClient( creditTransaction,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new transaction and updates the amount of a store credit or gift card.
	 * <p><pre><code>
	 *	CreditTransaction credittransaction = new CreditTransaction();
	 *	CountDownLatch latch = credittransaction.addTransaction( creditTransaction,  code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param creditTransaction Properties of a transaction performed for a customer credit that update the remaining balance of the credit.
	 * @return com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 * @see com.mozu.api.contracts.customer.credit.CreditTransaction
	 */
	public CountDownLatch addTransactionAsync(com.mozu.api.contracts.customer.credit.CreditTransaction creditTransaction, String code, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.CreditTransaction> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditTransaction> client = com.mozu.api.clients.commerce.customer.credits.CreditTransactionClient.addTransactionClient( creditTransaction,  code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



