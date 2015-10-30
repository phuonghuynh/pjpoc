<html>

<head>
  <title>POC PayJunction Application</title>
</head>

<body>
<div>

  <form method="get" action="checkout/recurring-bill/${transactionId}">
    <%--<input type="hidden" name="need_to_ship" value="no">--%>
    <%--<input type="hidden" name="need_to_tax" value="no">--%>
    <p>Created Transaction Id: ${transactionId}</p>
    <p>You can NOT re-bill a transaction immediately because of security after it recreated </p>

    <%--<!-- StoreId configured by quick-shop -->--%>
    <%--<input type="hidden" name="identifier" value="phuonghqh">--%>
    <%--<input type="hidden" name="store" value="phuonghqh">--%>

    <%--<input type="hidden" name="description" value="Sample product description">--%>
    <%--<input type="hidden" name="quantity" value="1">--%>
    <label>Enter Transaction Id</label>
    <input type="text" name="transactionId">

    <input type="submit" name="submit" value="Re-bill the transaction">
  </form>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
</body>

</html>