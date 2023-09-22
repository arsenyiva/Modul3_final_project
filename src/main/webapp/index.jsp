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
    <link rel="icon" type="image/png" sizes="192x192" href="css/images/icon/android-icon-192x192.png">
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
    <h1 class="main-title">Пролог</h1>
    <p class="sub-text"> Вы путник уставший с дороги. В этих краях очень небезопасно, особенно по ночам. Вдалеке
        виднеется замок и вам нужно туда попасть.</p>
    <p class="sub-text centered-text">Представьтесь пожалуйста...</p>
    <form action="stepzero" method="post" class="centered-form" id="myForm">
        <input type="text" name="username" class="styled-input" placeholder="Введите ваше имя">
        <input type="submit" value="Назвать свое имя" class="styled-button">
    </form>
</div>
<script>
    var form = document.getElementById("myForm");

    form.addEventListener("submit", function(event) {
        var usernameInput = form.querySelector("input[name='username']");
        var username = usernameInput.value.trim();
        if (username === "" || /^\d+$/.test(username) || /^\s+$/.test(username) || /\d/.test(username)) {
            alert("Пожалуйста, введите корректное имя без цифр и не содержащее только пробелы");
            event.preventDefault(); // Останавливаем отправку формы
        }
    });
</script>

</body>
</html>
