using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace hospital
{
    public partial class adminpage : Form
    {
        SqlConnection con = new SqlConnection(@"Data Source=.\SQLEXPRESS;AttachDbFilename=Database1.mdf;Integrated Security=True;User Instance=True");
        DataTable dt;
        public adminpage()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            doctor_login dl = new doctor_login();
            dl.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            patient p = new patient();
            p.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            con.Open();
            dt = new DataTable();
            SqlDataAdapter adapt = new SqlDataAdapter("select * from tbldoctor",con);
            adapt.Fill(dt);
            dataGridView1.DataSource = dt;
            con.Close();
            
        }

        private void button4_Click(object sender, EventArgs e)
        {
            con.Open();
            dt = new DataTable();
            SqlDataAdapter adapt= new SqlDataAdapter("select * from tbldoctor where specialisation = '"+textBox1.Text+"'", con);
            adapt.Fill(dt);
            dataGridView1.DataSource = dt;
            con.Close();
        }

        private void adminpage_Load(object sender, EventArgs e)
        {

        }
    }
}
