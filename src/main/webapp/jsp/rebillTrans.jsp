<html>

<head>
  <title>POC PayJunction Application</title>
</head>

<body>
<p>Transaction id: ${transaction.transactionId}</p>
<p>Transaction uri: ${transaction.uri}</p>
<p>Transaction status: ${transaction.status}</p>
<p>Transaction created: ${transaction.created}</p>
<p>Transaction lastModified: ${transaction.lastModified}</p>
<p>Transaction Response => approved: ${transaction.response.approved}</p>
<p>Transaction Response => message: ${transaction.response.message}</p>
<p>You can see more properties by debugging com.phuonghuynh.pjpoc.controller.CheckoutController.recurringBill </p>
</body>

</html>