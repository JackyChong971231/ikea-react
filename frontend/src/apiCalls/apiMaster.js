export const POST      = 'POST';
export const GET       = "GET";

const serverUrl = "http://localhost:8080"

export const apiGateway = async (method, endPoint, requestBody) => {
    // console.log(JSON.stringify(requestBody));
    const response = await fetch(serverUrl + endPoint, {
        method: method,
        mode: 'cors',
        credentials: 'include',
        headers: { 
            'Content-Type': 'application/json', 
            'Connection': 'keep-alive', 
            'Origin': 'http://localhost:5001' },
        body: JSON.stringify(requestBody)
    })
    const body = await response.json();
    return body;
}