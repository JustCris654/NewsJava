<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="style/style.css" />
    <title>Document</title>
</head>
<body>
<div class="container">
    <h1>Crea nuova news</h1>
    <form action="ViewNews" method="post" target="_blank">
        <div class="row">
            <label for="title" class="left">Titolo:</label>
            <input type="text" name="title" id="title" class="right" required/><br />
        </div>

        <div class="row">
            <label for="description" class="left">Descrizione:</label>
<%--            <input type="text" name="description" id="description" class="right" required/><br />--%>
            <textarea name="description" id="description" cols="30" rows="10" class="right"></textarea>
        </div>

        <div class="row">
            <label for="date" class="left">Data:</label>
            <input type="date" name="date" id="date" class="right" required/><br />
        </div>

        <div class="row">
            <label for="secretCode" class="left">Codice segreto:</label>
            <input type="password" name="secretCode" id="secretCode" class="right" required/> <br />
        </div>

        <div class="row">
            <input type="submit" value="Invia" />
        </div>
    </form>
</div>
</body>
</html>
