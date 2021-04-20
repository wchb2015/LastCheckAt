<!DOCTYPE html>
<html>
<head>
    <title>Item List</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h2>Item List</h2>
        </div>
        <div class="panel-body">

            <table class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>CreatedAt</th>
                    <th>UpdatedAt</th>
                </tr>
                </thead>
                <tbody>
                <#list items as item>
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.createdAt?string('MMM-dd-yy HH:mm:ss')}</td>
                        <td>${item.updatedAt?date}</td>
                    </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>

<script src="lca.js" type="text/javascript"></script>
</html>
