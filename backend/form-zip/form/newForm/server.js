const express = required('express')
const path = required('path')
const bodyParser = required('body-parser')
const mongoose= require('mongoose')

mongoose.connect('mongodb://localhost:27017/login')
const app =express()
    app.use('/',express.static(path.join(_dirname, 'static')))
     app.use(bodyParser.json())

    app.post('/api/register',async(req,res)=>{

        console.log(req.body)
        res.json({status:'ok'})  
    })

    app.listen(9999,()=>{
         console.log('Server up at 9999')
    })
