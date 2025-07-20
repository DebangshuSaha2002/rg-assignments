const http = require('http');

// TODO 1: In the below line, replace '' with code to import/require transactions data from './data/transactions.json'
// Using require will automatically parse it to a JSON
const transactions = require('../tasks3/data/transactions.json');

const server = http.createServer((req, res) => {
  const body = "Hello PayPal"
  if (req.url === '/') {
    // TODO 2: Implement response for '/' endpoint with proper HTTP status and 'Content-Type' using res.writeHead()
    res.writeHead(200,{
      'Content-Length': Buffer.byteLength(body),
      'content-type': 'text/plain'
    })
    .end(body)
  }
  else if (req.url === '/transactions') {
    // TODO 3: Implement response for '/transactions' endpoint with JSON data and proper headers

    //using pretty print here.
    const body = JSON.stringify(transactions,null,2)

    res.writeHead(200,{
      'content-length': Buffer.byteLength(body),
      'content-type': 'application/json'
    })
    .end(body);

  } else {
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('404 Not Found');
  }
});

const PORT = process.env.PORT || 3000;
server.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
