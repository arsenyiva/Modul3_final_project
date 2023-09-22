
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<html>
<head>
    <link rel="stylesheet" href="css/styles.css">
    <title>Quest</title>
    <link rel="apple-touch-icon" sizes="57x57" href="css/images/icon/apple-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="css/images/icon/apple-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="css/images/icon/apple-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="css/images/icon/apple-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="css/images/icon/apple-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="css/images/icon/apple-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="css/images/icon/apple-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="css/images/icon/apple-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="css/images/icon/apple-icon-180x180.png">
    <link rel="icon" type="image/png" sizes="192x192"  href="css/images/icon/android-icon-192x192.png">
    <link rel="icon" type="image/png" sizes="32x32" href="css/images/icon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="96x96" href="css/images/icon/favicon-96x96.png">
    <link rel="icon" type="image/png" sizes="16x16" href="css/images/icon/favicon-16x16.png">
    <link rel="manifest" href="css/images/icon/manifest.json">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
    <meta name="theme-color" content="#ffffff">
</head>
<body>
<div class="centered-content">
    <p class="sub-text"><br></p>
    <p class="sub-text">Прости, но я не пущу тебя в замок.</p>
    <h1 class="main-title">Вы проиграли!</h1>
</div>
<div class="button-container">
    <form method="post" action="restart">
        <button type="submit" name="answer" value="yes5">Начать сначала</button>
    </form>
    </div>
<div class="statistics">
    <p><strong>Статистика:</strong></p>
    <p>Количество запусков приложения: <%= session.getAttribute("launchCount") %></p>
    <p>Имя игрока: <%= session.getAttribute("username") %></p>
    <p>IP адрес игрока: <%= request.getRemoteAddr() %></p>
</div>
</body>
</html>
