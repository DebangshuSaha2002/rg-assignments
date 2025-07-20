const fs = require('fs').promises;
const path = require('path');

async function displayTransactions() {
  try {
    // TODO: Read 'transactions.json' file using fs.readFile or fs.readFile with async/await
    const data = await fs.readFile(path.join(__dirname,'/data/transactions.json'),'utf-8');
    const jsonData = JSON.parse(data);
    console.log(jsonData)
  }   
  catch (error) {
    // TODO: Handle errors that occur during file reading or JSON parsing
    console.log("The error message is: ",error)
  }
}

displayTransactions();
